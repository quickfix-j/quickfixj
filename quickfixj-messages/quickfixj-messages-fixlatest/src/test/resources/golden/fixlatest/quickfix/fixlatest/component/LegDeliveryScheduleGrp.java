/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDeliveryScheduleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41408, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegDeliveryScheduleGrp() {
    super();
  }

  public void set(quickfix.field.NoLegDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliverySchedules get(quickfix.field.NoLegDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliverySchedules getNoLegDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoLegDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliverySchedules() {
    return isSetField(41408);
  }

public static class NoLegDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41409, 41410, 41411, 41412, 41413, 41414, 41415, 41416, 41417, 41418, 41419, 41420, 41421, 41422, 0};

  public NoLegDeliverySchedules() {
    super(41408, 41409, ORDER);
  }

  public void set(quickfix.field.LegDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleType get(quickfix.field.LegDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleType getLegDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleType() {
    return isSetField(41409);
  }

  public void set(quickfix.field.LegDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleXID get(quickfix.field.LegDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleXID getLegDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleXID() {
    return isSetField(41410);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotional get(quickfix.field.LegDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotional getLegDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotional() {
    return isSetField(41411);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure getLegDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41412);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency getLegDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41413);
  }

  public void set(quickfix.field.LegDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance get(quickfix.field.LegDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance getLegDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNegativeTolerance() {
    return isSetField(41414);
  }

  public void set(quickfix.field.LegDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance get(quickfix.field.LegDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance getLegDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliverySchedulePositiveTolerance() {
    return isSetField(41415);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure getLegDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41416);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceType get(quickfix.field.LegDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceType getLegDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceType() {
    return isSetField(41417);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry get(quickfix.field.LegDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry getLegDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlCountry() {
    return isSetField(41418);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone get(quickfix.field.LegDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone getLegDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeZone() {
    return isSetField(41419);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType get(quickfix.field.LegDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType getLegDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlFlowType() {
    return isSetField(41420);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction getLegDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41421);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp getLegDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp());
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
}

  public void set(quickfix.field.LegDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleType get(quickfix.field.LegDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleType getLegDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleType() {
    return isSetField(41409);
  }

  public void set(quickfix.field.LegDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleXID get(quickfix.field.LegDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleXID getLegDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleXID() {
    return isSetField(41410);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotional get(quickfix.field.LegDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotional getLegDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotional() {
    return isSetField(41411);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure getLegDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41412);
  }

  public void set(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency getLegDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41413);
  }

  public void set(quickfix.field.LegDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance get(quickfix.field.LegDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleNegativeTolerance getLegDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleNegativeTolerance() {
    return isSetField(41414);
  }

  public void set(quickfix.field.LegDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance get(quickfix.field.LegDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliverySchedulePositiveTolerance getLegDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliverySchedulePositiveTolerance() {
    return isSetField(41415);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure getLegDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41416);
  }

  public void set(quickfix.field.LegDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleToleranceType get(quickfix.field.LegDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleToleranceType getLegDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleToleranceType() {
    return isSetField(41417);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry get(quickfix.field.LegDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlCountry getLegDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlCountry() {
    return isSetField(41418);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone get(quickfix.field.LegDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlTimeZone getLegDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlTimeZone() {
    return isSetField(41419);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType get(quickfix.field.LegDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlFlowType getLegDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlFlowType() {
    return isSetField(41420);
  }

  public void set(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction getLegDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.LegDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41421);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp getLegDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryScheduleSettlDayGrp());
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
}
