/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDeliveryStreamCycleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41456, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegDeliveryStreamCycleGrp() {
    super();
  }

  public void set(quickfix.field.NoLegDeliveryStreamCycles value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryStreamCycles get(quickfix.field.NoLegDeliveryStreamCycles value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryStreamCycles getNoLegDeliveryStreamCycles() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryStreamCycles());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryStreamCycles field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryStreamCycles() {
    return isSetField(41456);
  }

public static class NoLegDeliveryStreamCycles extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41457, 41458, 41459, 0};

  public NoLegDeliveryStreamCycles() {
    super(41456, 41457, ORDER);
  }

  public void set(quickfix.field.LegDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamCycleDesc get(quickfix.field.LegDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamCycleDesc getLegDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamCycleDesc() {
    return isSetField(41457);
  }

  public void set(quickfix.field.EncodedLegDeliveryStreamCycleDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDescLen get(quickfix.field.EncodedLegDeliveryStreamCycleDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDescLen getEncodedLegDeliveryStreamCycleDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegDeliveryStreamCycleDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegDeliveryStreamCycleDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegDeliveryStreamCycleDescLen() {
    return isSetField(41458);
  }

  public void set(quickfix.field.EncodedLegDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDesc get(quickfix.field.EncodedLegDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDesc getEncodedLegDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegDeliveryStreamCycleDesc() {
    return isSetField(41459);
  }
}

  public void set(quickfix.field.LegDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamCycleDesc get(quickfix.field.LegDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamCycleDesc getLegDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamCycleDesc() {
    return isSetField(41457);
  }

  public void set(quickfix.field.EncodedLegDeliveryStreamCycleDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDescLen get(quickfix.field.EncodedLegDeliveryStreamCycleDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDescLen getEncodedLegDeliveryStreamCycleDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegDeliveryStreamCycleDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegDeliveryStreamCycleDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegDeliveryStreamCycleDescLen() {
    return isSetField(41458);
  }

  public void set(quickfix.field.EncodedLegDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDesc get(quickfix.field.EncodedLegDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDesc getEncodedLegDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegDeliveryStreamCycleDesc() {
    return isSetField(41459);
  }
}
