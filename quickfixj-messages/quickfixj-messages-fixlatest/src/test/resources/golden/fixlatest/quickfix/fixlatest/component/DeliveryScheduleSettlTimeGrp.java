/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DeliveryScheduleSettlTimeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41054, };
  protected int[] getGroupFields() { return componentGroups; }

  public DeliveryScheduleSettlTimeGrp() {
    super();
  }

  public void set(quickfix.field.NoDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryScheduleSettlTimes get(quickfix.field.NoDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryScheduleSettlTimes getNoDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryScheduleSettlTimes() {
    return isSetField(41054);
  }

public static class NoDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41055, 41056, 41057, 0};

  public NoDeliveryScheduleSettlTimes() {
    super(41054, 41055, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlStart get(quickfix.field.DeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlStart getDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlStart() {
    return isSetField(41055);
  }

  public void set(quickfix.field.DeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlEnd get(quickfix.field.DeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlEnd getDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlEnd() {
    return isSetField(41056);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeType get(quickfix.field.DeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeType getDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeType() {
    return isSetField(41057);
  }
}

  public void set(quickfix.field.DeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlStart get(quickfix.field.DeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlStart getDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlStart() {
    return isSetField(41055);
  }

  public void set(quickfix.field.DeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlEnd get(quickfix.field.DeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlEnd getDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlEnd() {
    return isSetField(41056);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeType get(quickfix.field.DeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeType getDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeType() {
    return isSetField(41057);
  }
}
