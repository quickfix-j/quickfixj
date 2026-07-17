/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDeliveryScheduleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41756, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDeliveryScheduleGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingDeliverySchedules value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliverySchedules get(quickfix.field.NoUnderlyingDeliverySchedules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliverySchedules getNoUnderlyingDeliverySchedules() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliverySchedules());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliverySchedules field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliverySchedules() {
    return isSetField(41756);
  }

public static class NoUnderlyingDeliverySchedules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41757, 41758, 41759, 41760, 41761, 41762, 41763, 41764, 41765, 41766, 41767, 41768, 41769, 41770, 0};

  public NoUnderlyingDeliverySchedules() {
    super(41756, 41757, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleType get(quickfix.field.UnderlyingDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleType getUnderlyingDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleType() {
    return isSetField(41757);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID get(quickfix.field.UnderlyingDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID getUnderlyingDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleXID() {
    return isSetField(41758);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional get(quickfix.field.UnderlyingDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional getUnderlyingDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotional() {
    return isSetField(41759);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure getUnderlyingDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41760);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency getUnderlyingDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41761);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance get(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance getUnderlyingDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNegativeTolerance() {
    return isSetField(41762);
  }

  public void set(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance get(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance getUnderlyingDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliverySchedulePositiveTolerance() {
    return isSetField(41763);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure getUnderlyingDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41764);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType get(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType getUnderlyingDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceType() {
    return isSetField(41765);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry get(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry getUnderlyingDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlCountry() {
    return isSetField(41766);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone getUnderlyingDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeZone() {
    return isSetField(41767);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType get(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType getUnderlyingDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlFlowType() {
    return isSetField(41768);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction getUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41769);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp getUnderlyingDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp());
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
}

  public void set(quickfix.field.UnderlyingDeliveryScheduleType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleType get(quickfix.field.UnderlyingDeliveryScheduleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleType getUnderlyingDeliveryScheduleType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleType() {
    return isSetField(41757);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID get(quickfix.field.UnderlyingDeliveryScheduleXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleXID getUnderlyingDeliveryScheduleXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleXID());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleXID() {
    return isSetField(41758);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional get(quickfix.field.UnderlyingDeliveryScheduleNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotional getUnderlyingDeliveryScheduleNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotional() {
    return isSetField(41759);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure getUnderlyingDeliveryScheduleNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalUnitOfMeasure() {
    return isSetField(41760);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency get(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency getUnderlyingDeliveryScheduleNotionalCommodityFrequency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNotionalCommodityFrequency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNotionalCommodityFrequency() {
    return isSetField(41761);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance get(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance getUnderlyingDeliveryScheduleNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleNegativeTolerance() {
    return isSetField(41762);
  }

  public void set(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance get(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliverySchedulePositiveTolerance getUnderlyingDeliverySchedulePositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliverySchedulePositiveTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliverySchedulePositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliverySchedulePositiveTolerance() {
    return isSetField(41763);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure get(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure getUnderlyingDeliveryScheduleToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceUnitOfMeasure() {
    return isSetField(41764);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType get(quickfix.field.UnderlyingDeliveryScheduleToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleToleranceType getUnderlyingDeliveryScheduleToleranceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleToleranceType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleToleranceType() {
    return isSetField(41765);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry get(quickfix.field.UnderlyingDeliveryScheduleSettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlCountry getUnderlyingDeliveryScheduleSettlCountry() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlCountry());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlCountry() {
    return isSetField(41766);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone get(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone getUnderlyingDeliveryScheduleSettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlTimeZone() {
    return isSetField(41767);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType get(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlFlowType getUnderlyingDeliveryScheduleSettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlFlowType() {
    return isSetField(41768);
  }

  public void set(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction get(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction getUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryScheduleSettlHolidaysProcessingInstruction() {
    return isSetField(41769);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp get(quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp getUnderlyingDeliveryScheduleSettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryScheduleSettlDayGrp());
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
}
