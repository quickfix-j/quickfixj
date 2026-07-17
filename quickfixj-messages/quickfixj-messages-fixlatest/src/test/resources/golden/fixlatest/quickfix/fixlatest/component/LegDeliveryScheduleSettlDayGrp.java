/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDeliveryScheduleSettlDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41422, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegDeliveryScheduleSettlDayGrp() {
    super();
  }

  public void set(quickfix.field.NoLegDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryScheduleSettlDays get(quickfix.field.NoLegDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryScheduleSettlDays getNoLegDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryScheduleSettlDays() {
    return isSetField(41422);
  }

public static class NoLegDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41423, 41424, 41425, 0};

  public NoLegDeliveryScheduleSettlDays() {
    super(41422, 41423, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlDay get(quickfix.field.LegDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlDay getLegDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlDay() {
    return isSetField(41423);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours get(quickfix.field.LegDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours getLegDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTotalHours() {
    return isSetField(41424);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp getLegDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp());
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
}

  public void set(quickfix.field.LegDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlDay get(quickfix.field.LegDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlDay getLegDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlDay() {
    return isSetField(41423);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours get(quickfix.field.LegDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTotalHours getLegDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTotalHours() {
    return isSetField(41424);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp getLegDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlTimeGrp());
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
}
