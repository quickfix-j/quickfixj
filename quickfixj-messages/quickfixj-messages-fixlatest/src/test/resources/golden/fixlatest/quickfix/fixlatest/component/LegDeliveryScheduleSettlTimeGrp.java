/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDeliveryScheduleSettlTimeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41425, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegDeliveryScheduleSettlTimeGrp() {
    super();
  }

  public void set(quickfix.field.NoLegDeliveryScheduleSettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryScheduleSettlTimes get(quickfix.field.NoLegDeliveryScheduleSettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryScheduleSettlTimes getNoLegDeliveryScheduleSettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryScheduleSettlTimes());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryScheduleSettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryScheduleSettlTimes() {
    return isSetField(41425);
  }

public static class NoLegDeliveryScheduleSettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41426, 41427, 41428, 0};

  public NoLegDeliveryScheduleSettlTimes() {
    super(41425, 41426, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlStart get(quickfix.field.LegDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlStart getLegDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlStart() {
    return isSetField(41426);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd get(quickfix.field.LegDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd getLegDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlEnd() {
    return isSetField(41427);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType get(quickfix.field.LegDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType getLegDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeType() {
    return isSetField(41428);
  }
}

  public void set(quickfix.field.LegDeliveryScheduleSettlStart value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlStart get(quickfix.field.LegDeliveryScheduleSettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlStart getLegDeliveryScheduleSettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlStart());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlStart() {
    return isSetField(41426);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd get(quickfix.field.LegDeliveryScheduleSettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlEnd getLegDeliveryScheduleSettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlEnd());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlEnd() {
    return isSetField(41427);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType get(quickfix.field.LegDeliveryScheduleSettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeType getLegDeliveryScheduleSettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeType() {
    return isSetField(41428);
  }
}
