/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DeliveryScheduleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41037, };
  protected int[] getGroupFields() { return componentGroups; }

  public DeliveryScheduleGrp() {
    super();
  }

  public void set(quickfix.field.NoDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoDeliverySchedules get(quickfix.field.NoDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliverySchedules getNoDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliverySchedules() {
    return isSetField(41037);
  }

public static class NoDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41038, 41039, 41040, 41041, 41042, 41043, 41044, 41045, 41046, 41047, 41048, 41049, 41050, 41051, 0};

  public NoDeliverySchedules() {
    super(41037, 41038, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleType get(quickfix.field.DeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleType getDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleType() {
    return isSetField(41038);
  }

  public void set(quickfix.field.DeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleXID get(quickfix.field.DeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleXID getDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleXID() {
    return isSetField(41039);
  }

  public void set(quickfix.field.DeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotional get(quickfix.field.DeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotional getDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotional() {
    return isSetField(41040);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure getDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41041);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency get(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency getDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41042);
  }

  public void set(quickfix.field.DeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance get(quickfix.field.DeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance getDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNegativeTolerance() {
    return isSetField(41043);
  }

  public void set(quickfix.field.DeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliverySchedulePositiveTolerance get(quickfix.field.DeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliverySchedulePositiveTolerance getDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.DeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliverySchedulePositiveTolerance() {
    return isSetField(41044);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure getDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41045);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceType get(quickfix.field.DeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceType getDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceType() {
    return isSetField(41046);
  }

  public void set(quickfix.field.DeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlCountry get(quickfix.field.DeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlCountry getDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlCountry() {
    return isSetField(41047);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone get(quickfix.field.DeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone getDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeZone() {
    return isSetField(41048);
  }

  public void set(quickfix.field.DeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlFlowType get(quickfix.field.DeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlFlowType getDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlFlowType() {
    return isSetField(41049);
  }

  public void set(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction getDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41050);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp getDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryScheduleSettlDays get(quickfix.field.NoDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryScheduleSettlDays getNoDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryScheduleSettlDays() {
    return isSetField(41051);
  }

public static class NoDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41052, 41053, 41054, 0};

  public NoDeliveryScheduleSettlDays() {
    super(41051, 41052, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlDay get(quickfix.field.DeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlDay getDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlDay() {
    return isSetField(41052);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours get(quickfix.field.DeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours getDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTotalHours() {
    return isSetField(41053);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp getDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp());
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
}
}

  public void set(quickfix.field.DeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleType get(quickfix.field.DeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleType getDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleType() {
    return isSetField(41038);
  }

  public void set(quickfix.field.DeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleXID get(quickfix.field.DeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleXID getDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleXID() {
    return isSetField(41039);
  }

  public void set(quickfix.field.DeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotional get(quickfix.field.DeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotional getDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotional() {
    return isSetField(41040);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalUnitOfMeasure getDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41041);
  }

  public void set(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency get(quickfix.field.DeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNotionalCommodityFrequency getDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41042);
  }

  public void set(quickfix.field.DeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance get(quickfix.field.DeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleNegativeTolerance getDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleNegativeTolerance() {
    return isSetField(41043);
  }

  public void set(quickfix.field.DeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliverySchedulePositiveTolerance get(quickfix.field.DeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliverySchedulePositiveTolerance getDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.DeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliverySchedulePositiveTolerance() {
    return isSetField(41044);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceUnitOfMeasure getDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41045);
  }

  public void set(quickfix.field.DeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleToleranceType get(quickfix.field.DeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleToleranceType getDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleToleranceType() {
    return isSetField(41046);
  }

  public void set(quickfix.field.DeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlCountry get(quickfix.field.DeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlCountry getDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlCountry() {
    return isSetField(41047);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone get(quickfix.field.DeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTimeZone getDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTimeZone() {
    return isSetField(41048);
  }

  public void set(quickfix.field.DeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlFlowType get(quickfix.field.DeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlFlowType getDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlFlowType() {
    return isSetField(41049);
  }

  public void set(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction getDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41050);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp getDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlDayGrp());
  }

  public void set(quickfix.field.NoDeliveryScheduleSettlDays value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryScheduleSettlDays get(quickfix.field.NoDeliveryScheduleSettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryScheduleSettlDays getNoDeliveryScheduleSettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryScheduleSettlDays());
  }

  public boolean isSet(quickfix.field.NoDeliveryScheduleSettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryScheduleSettlDays() {
    return isSetField(41051);
  }

public static class NoDeliveryScheduleSettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41052, 41053, 41054, 0};

  public NoDeliveryScheduleSettlDays() {
    super(41051, 41052, ORDER);
  }

  public void set(quickfix.field.DeliveryScheduleSettlDay value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlDay get(quickfix.field.DeliveryScheduleSettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlDay getDeliveryScheduleSettlDay() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlDay());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlDay field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlDay() {
    return isSetField(41052);
  }

  public void set(quickfix.field.DeliveryScheduleSettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours get(quickfix.field.DeliveryScheduleSettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryScheduleSettlTotalHours getDeliveryScheduleSettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.DeliveryScheduleSettlTotalHours());
  }

  public boolean isSet(quickfix.field.DeliveryScheduleSettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryScheduleSettlTotalHours() {
    return isSetField(41053);
  }

  public void set(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp get(quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp getDeliveryScheduleSettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryScheduleSettlTimeGrp());
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
}
}
