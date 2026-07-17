/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventCreditEventSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41748, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventCreditEventSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventSources get(quickfix.field.NoUnderlyingComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventSources getNoUnderlyingComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventSources() {
    return isSetField(41748);
  }

public static class NoUnderlyingComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41749, 0};

  public NoUnderlyingComplexEventCreditEventSources() {
    super(41748, 41749, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource get(quickfix.field.UnderlyingComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource getUnderlyingComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventSource() {
    return isSetField(41749);
  }
}

  public void set(quickfix.field.UnderlyingComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource get(quickfix.field.UnderlyingComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventSource getUnderlyingComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventSource() {
    return isSetField(41749);
  }
}
