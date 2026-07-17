/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DeliveryStreamCycleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41081, };
  protected int[] getGroupFields() { return componentGroups; }

  public DeliveryStreamCycleGrp() {
    super();
  }

  public void set(quickfix.field.NoDeliveryStreamCycles value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryStreamCycles get(quickfix.field.NoDeliveryStreamCycles value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryStreamCycles getNoDeliveryStreamCycles() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryStreamCycles());
  }

  public boolean isSet(quickfix.field.NoDeliveryStreamCycles field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryStreamCycles() {
    return isSetField(41081);
  }

public static class NoDeliveryStreamCycles extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41082, 41083, 41084, 0};

  public NoDeliveryStreamCycles() {
    super(41081, 41082, ORDER);
  }

  public void set(quickfix.field.DeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamCycleDesc get(quickfix.field.DeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamCycleDesc getDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.DeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamCycleDesc() {
    return isSetField(41082);
  }

  public void set(quickfix.field.EncodedDeliveryStreamCycleDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedDeliveryStreamCycleDescLen get(quickfix.field.EncodedDeliveryStreamCycleDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedDeliveryStreamCycleDescLen getEncodedDeliveryStreamCycleDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedDeliveryStreamCycleDescLen());
  }

  public boolean isSet(quickfix.field.EncodedDeliveryStreamCycleDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedDeliveryStreamCycleDescLen() {
    return isSetField(41083);
  }

  public void set(quickfix.field.EncodedDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedDeliveryStreamCycleDesc get(quickfix.field.EncodedDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedDeliveryStreamCycleDesc getEncodedDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.EncodedDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedDeliveryStreamCycleDesc() {
    return isSetField(41084);
  }
}

  public void set(quickfix.field.DeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamCycleDesc get(quickfix.field.DeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamCycleDesc getDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.DeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamCycleDesc() {
    return isSetField(41082);
  }

  public void set(quickfix.field.EncodedDeliveryStreamCycleDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedDeliveryStreamCycleDescLen get(quickfix.field.EncodedDeliveryStreamCycleDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedDeliveryStreamCycleDescLen getEncodedDeliveryStreamCycleDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedDeliveryStreamCycleDescLen());
  }

  public boolean isSet(quickfix.field.EncodedDeliveryStreamCycleDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedDeliveryStreamCycleDescLen() {
    return isSetField(41083);
  }

  public void set(quickfix.field.EncodedDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedDeliveryStreamCycleDesc get(quickfix.field.EncodedDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedDeliveryStreamCycleDesc getEncodedDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.EncodedDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedDeliveryStreamCycleDesc() {
    return isSetField(41084);
  }
}
