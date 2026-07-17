/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDeliveryStreamCycleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41804, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDeliveryStreamCycleGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingDeliveryStreamCycles value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryStreamCycles get(quickfix.field.NoUnderlyingDeliveryStreamCycles value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryStreamCycles getNoUnderlyingDeliveryStreamCycles() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryStreamCycles());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryStreamCycles field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryStreamCycles() {
    return isSetField(41804);
  }

public static class NoUnderlyingDeliveryStreamCycles extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41805, 41806, 41807, 0};

  public NoUnderlyingDeliveryStreamCycles() {
    super(41804, 41805, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamCycleDesc get(quickfix.field.UnderlyingDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamCycleDesc getUnderlyingDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamCycleDesc() {
    return isSetField(41805);
  }

  public void set(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen get(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen getEncodedUnderlyingDeliveryStreamCycleDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingDeliveryStreamCycleDescLen() {
    return isSetField(41806);
  }

  public void set(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc get(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc getEncodedUnderlyingDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingDeliveryStreamCycleDesc() {
    return isSetField(41807);
  }
}

  public void set(quickfix.field.UnderlyingDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamCycleDesc get(quickfix.field.UnderlyingDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamCycleDesc getUnderlyingDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamCycleDesc() {
    return isSetField(41805);
  }

  public void set(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen get(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen getEncodedUnderlyingDeliveryStreamCycleDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingDeliveryStreamCycleDescLen() {
    return isSetField(41806);
  }

  public void set(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc get(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc getEncodedUnderlyingDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingDeliveryStreamCycleDesc() {
    return isSetField(41807);
  }
}
