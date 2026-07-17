/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDeliveryScheduleSettlTimeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41773, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDeliveryScheduleSettlTimeGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes get(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes getNoUnderlyingDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryScheduleSettlTimes() {
    return isSetField(41773);
  }

public static class NoUnderlyingDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41774, 41775, 41776, 0};

  public NoUnderlyingDeliveryScheduleSettlTimes() {
    super(41773, 41774, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart get(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart getUnderlyingDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlStart() {
    return isSetField(41774);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd get(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd getUnderlyingDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlEnd() {
    return isSetField(41775);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType getUnderlyingDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeType() {
    return isSetField(41776);
  }
}

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart get(quickfix.field.UnderlyingDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlStart getUnderlyingDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlStart() {
    return isSetField(41774);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd get(quickfix.field.UnderlyingDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlEnd getUnderlyingDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlEnd() {
    return isSetField(41775);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeType getUnderlyingDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeType() {
    return isSetField(41776);
  }
}
