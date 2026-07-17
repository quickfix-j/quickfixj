/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDeliveryScheduleSettlDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41770, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDeliveryScheduleSettlDayGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlDays get(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryScheduleSettlDays getNoUnderlyingDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryScheduleSettlDays() {
    return isSetField(41770);
  }

public static class NoUnderlyingDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41771, 41772, 41773, 0};

  public NoUnderlyingDeliveryScheduleSettlDays() {
    super(41770, 41771, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay get(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay getUnderlyingDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlDay() {
    return isSetField(41771);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours get(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours getUnderlyingDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTotalHours() {
    return isSetField(41772);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp getUnderlyingDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp());
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
}

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay get(quickfix.field.UnderlyingDeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlDay getUnderlyingDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlDay() {
    return isSetField(41771);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours get(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours getUnderlyingDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTotalHours() {
    return isSetField(41772);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp getUnderlyingDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlTimeGrp());
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
}
