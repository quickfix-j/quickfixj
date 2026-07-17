/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventCreditEventSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41398, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventCreditEventSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventSources value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventSources get(quickfix.field.NoLegComplexEventCreditEventSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventSources getNoLegComplexEventCreditEventSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventSources());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventSources() {
    return isSetField(41398);
  }

public static class NoLegComplexEventCreditEventSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41399, 0};

  public NoLegComplexEventCreditEventSources() {
    super(41398, 41399, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventSource get(quickfix.field.LegComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventSource getLegComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventSource() {
    return isSetField(41399);
  }
}

  public void set(quickfix.field.LegComplexEventCreditEventSource value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventSource get(quickfix.field.LegComplexEventCreditEventSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventSource getLegComplexEventCreditEventSource() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventSource());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventSource field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventSource() {
    return isSetField(41399);
  }
}
