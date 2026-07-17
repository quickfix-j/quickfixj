/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class OrderEventGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1795, };
  protected int[] getGroupFields() { return componentGroups; }

  public OrderEventGrp() {
    super();
  }

  public void set(quickfix.field.NoOrderEvents value) {
    setField(value);
  }

  public quickfix.field.NoOrderEvents get(quickfix.field.NoOrderEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrderEvents getNoOrderEvents() throws FieldNotFound {
    return get(new quickfix.field.NoOrderEvents());
  }

  public boolean isSet(quickfix.field.NoOrderEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoOrderEvents() {
    return isSetField(1795);
  }

public static class NoOrderEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1796, 1797, 1798, 1799, 1800, 1801, 1802, 0};

  public NoOrderEvents() {
    super(1795, 1796, ORDER);
  }

  public void set(quickfix.field.OrderEventType value) {
    setField(value);
  }

  public quickfix.field.OrderEventType get(quickfix.field.OrderEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventType getOrderEventType() throws FieldNotFound {
    return get(new quickfix.field.OrderEventType());
  }

  public boolean isSet(quickfix.field.OrderEventType field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventType() {
    return isSetField(1796);
  }

  public void set(quickfix.field.OrderEventExecID value) {
    setField(value);
  }

  public quickfix.field.OrderEventExecID get(quickfix.field.OrderEventExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventExecID getOrderEventExecID() throws FieldNotFound {
    return get(new quickfix.field.OrderEventExecID());
  }

  public boolean isSet(quickfix.field.OrderEventExecID field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventExecID() {
    return isSetField(1797);
  }

  public void set(quickfix.field.OrderEventReason value) {
    setField(value);
  }

  public quickfix.field.OrderEventReason get(quickfix.field.OrderEventReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventReason getOrderEventReason() throws FieldNotFound {
    return get(new quickfix.field.OrderEventReason());
  }

  public boolean isSet(quickfix.field.OrderEventReason field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventReason() {
    return isSetField(1798);
  }

  public void set(quickfix.field.OrderEventPx value) {
    setField(value);
  }

  public quickfix.field.OrderEventPx get(quickfix.field.OrderEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventPx getOrderEventPx() throws FieldNotFound {
    return get(new quickfix.field.OrderEventPx());
  }

  public boolean isSet(quickfix.field.OrderEventPx field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventPx() {
    return isSetField(1799);
  }

  public void set(quickfix.field.OrderEventQty value) {
    setField(value);
  }

  public quickfix.field.OrderEventQty get(quickfix.field.OrderEventQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventQty getOrderEventQty() throws FieldNotFound {
    return get(new quickfix.field.OrderEventQty());
  }

  public boolean isSet(quickfix.field.OrderEventQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventQty() {
    return isSetField(1800);
  }

  public void set(quickfix.field.OrderEventLiquidityIndicator value) {
    setField(value);
  }

  public quickfix.field.OrderEventLiquidityIndicator get(quickfix.field.OrderEventLiquidityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventLiquidityIndicator getOrderEventLiquidityIndicator() throws FieldNotFound {
    return get(new quickfix.field.OrderEventLiquidityIndicator());
  }

  public boolean isSet(quickfix.field.OrderEventLiquidityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventLiquidityIndicator() {
    return isSetField(1801);
  }

  public void set(quickfix.field.OrderEventText value) {
    setField(value);
  }

  public quickfix.field.OrderEventText get(quickfix.field.OrderEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventText getOrderEventText() throws FieldNotFound {
    return get(new quickfix.field.OrderEventText());
  }

  public boolean isSet(quickfix.field.OrderEventText field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventText() {
    return isSetField(1802);
  }
}

  public void set(quickfix.field.OrderEventType value) {
    setField(value);
  }

  public quickfix.field.OrderEventType get(quickfix.field.OrderEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventType getOrderEventType() throws FieldNotFound {
    return get(new quickfix.field.OrderEventType());
  }

  public boolean isSet(quickfix.field.OrderEventType field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventType() {
    return isSetField(1796);
  }

  public void set(quickfix.field.OrderEventExecID value) {
    setField(value);
  }

  public quickfix.field.OrderEventExecID get(quickfix.field.OrderEventExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventExecID getOrderEventExecID() throws FieldNotFound {
    return get(new quickfix.field.OrderEventExecID());
  }

  public boolean isSet(quickfix.field.OrderEventExecID field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventExecID() {
    return isSetField(1797);
  }

  public void set(quickfix.field.OrderEventReason value) {
    setField(value);
  }

  public quickfix.field.OrderEventReason get(quickfix.field.OrderEventReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventReason getOrderEventReason() throws FieldNotFound {
    return get(new quickfix.field.OrderEventReason());
  }

  public boolean isSet(quickfix.field.OrderEventReason field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventReason() {
    return isSetField(1798);
  }

  public void set(quickfix.field.OrderEventPx value) {
    setField(value);
  }

  public quickfix.field.OrderEventPx get(quickfix.field.OrderEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventPx getOrderEventPx() throws FieldNotFound {
    return get(new quickfix.field.OrderEventPx());
  }

  public boolean isSet(quickfix.field.OrderEventPx field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventPx() {
    return isSetField(1799);
  }

  public void set(quickfix.field.OrderEventQty value) {
    setField(value);
  }

  public quickfix.field.OrderEventQty get(quickfix.field.OrderEventQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventQty getOrderEventQty() throws FieldNotFound {
    return get(new quickfix.field.OrderEventQty());
  }

  public boolean isSet(quickfix.field.OrderEventQty field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventQty() {
    return isSetField(1800);
  }

  public void set(quickfix.field.OrderEventLiquidityIndicator value) {
    setField(value);
  }

  public quickfix.field.OrderEventLiquidityIndicator get(quickfix.field.OrderEventLiquidityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventLiquidityIndicator getOrderEventLiquidityIndicator() throws FieldNotFound {
    return get(new quickfix.field.OrderEventLiquidityIndicator());
  }

  public boolean isSet(quickfix.field.OrderEventLiquidityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventLiquidityIndicator() {
    return isSetField(1801);
  }

  public void set(quickfix.field.OrderEventText value) {
    setField(value);
  }

  public quickfix.field.OrderEventText get(quickfix.field.OrderEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderEventText getOrderEventText() throws FieldNotFound {
    return get(new quickfix.field.OrderEventText());
  }

  public boolean isSet(quickfix.field.OrderEventText field) {
    return isSetField(field);
  }

  public boolean isSetOrderEventText() {
    return isSetField(1802);
  }
}
