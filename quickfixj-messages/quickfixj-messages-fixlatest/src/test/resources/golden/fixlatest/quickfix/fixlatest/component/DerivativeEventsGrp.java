/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DerivativeEventsGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1286, };
  protected int[] getGroupFields() { return componentGroups; }

  public DerivativeEventsGrp() {
    super();
  }

  public void set(quickfix.field.NoDerivativeEvents value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeEvents get(quickfix.field.NoDerivativeEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeEvents getNoDerivativeEvents() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeEvents());
  }

  public boolean isSet(quickfix.field.NoDerivativeEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeEvents() {
    return isSetField(1286);
  }

public static class NoDerivativeEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1287, 1288, 1289, 1290, 1291, 0};

  public NoDerivativeEvents() {
    super(1286, 1287, ORDER);
  }

  public void set(quickfix.field.DerivativeEventType value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventType get(quickfix.field.DerivativeEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventType getDerivativeEventType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventType());
  }

  public boolean isSet(quickfix.field.DerivativeEventType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventType() {
    return isSetField(1287);
  }

  public void set(quickfix.field.DerivativeEventDate value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventDate get(quickfix.field.DerivativeEventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventDate getDerivativeEventDate() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventDate());
  }

  public boolean isSet(quickfix.field.DerivativeEventDate field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventDate() {
    return isSetField(1288);
  }

  public void set(quickfix.field.DerivativeEventTime value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventTime get(quickfix.field.DerivativeEventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventTime getDerivativeEventTime() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventTime());
  }

  public boolean isSet(quickfix.field.DerivativeEventTime field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventTime() {
    return isSetField(1289);
  }

  public void set(quickfix.field.DerivativeEventPx value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventPx get(quickfix.field.DerivativeEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventPx getDerivativeEventPx() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventPx());
  }

  public boolean isSet(quickfix.field.DerivativeEventPx field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventPx() {
    return isSetField(1290);
  }

  public void set(quickfix.field.DerivativeEventText value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventText get(quickfix.field.DerivativeEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventText getDerivativeEventText() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventText());
  }

  public boolean isSet(quickfix.field.DerivativeEventText field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventText() {
    return isSetField(1291);
  }
}

  public void set(quickfix.field.DerivativeEventType value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventType get(quickfix.field.DerivativeEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventType getDerivativeEventType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventType());
  }

  public boolean isSet(quickfix.field.DerivativeEventType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventType() {
    return isSetField(1287);
  }

  public void set(quickfix.field.DerivativeEventDate value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventDate get(quickfix.field.DerivativeEventDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventDate getDerivativeEventDate() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventDate());
  }

  public boolean isSet(quickfix.field.DerivativeEventDate field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventDate() {
    return isSetField(1288);
  }

  public void set(quickfix.field.DerivativeEventTime value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventTime get(quickfix.field.DerivativeEventTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventTime getDerivativeEventTime() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventTime());
  }

  public boolean isSet(quickfix.field.DerivativeEventTime field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventTime() {
    return isSetField(1289);
  }

  public void set(quickfix.field.DerivativeEventPx value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventPx get(quickfix.field.DerivativeEventPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventPx getDerivativeEventPx() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventPx());
  }

  public boolean isSet(quickfix.field.DerivativeEventPx field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventPx() {
    return isSetField(1290);
  }

  public void set(quickfix.field.DerivativeEventText value) {
    setField(value);
  }

  public quickfix.field.DerivativeEventText get(quickfix.field.DerivativeEventText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeEventText getDerivativeEventText() throws FieldNotFound {
    return get(new quickfix.field.DerivativeEventText());
  }

  public boolean isSet(quickfix.field.DerivativeEventText field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeEventText() {
    return isSetField(1291);
  }
}
