/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCommoditySettlPeriodGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41686, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCommoditySettlPeriodGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlPeriods value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlPeriods get(quickfix.field.NoLegStreamCommoditySettlPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlPeriods getNoLegStreamCommoditySettlPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlPeriods());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlPeriods() {
    return isSetField(41686);
  }

public static class NoLegStreamCommoditySettlPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41687, 41688, 41689, 41690, 41691, 41692, 41693, 41694, 41695, 41696, 41697, 41680, 41698, 41699, 0};

  public NoLegStreamCommoditySettlPeriods() {
    super(41686, 41687, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlCountry value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlCountry get(quickfix.field.LegStreamCommoditySettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlCountry getLegStreamCommoditySettlCountry() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlCountry());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlCountry() {
    return isSetField(41687);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTimeZone get(quickfix.field.LegStreamCommoditySettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTimeZone getLegStreamCommoditySettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTimeZone());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTimeZone() {
    return isSetField(41688);
  }

  public void set(quickfix.field.LegStreamCommoditySettlFlowType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlFlowType get(quickfix.field.LegStreamCommoditySettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlFlowType getLegStreamCommoditySettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlFlowType());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlFlowType() {
    return isSetField(41689);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodNotional value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotional get(quickfix.field.LegStreamCommoditySettlPeriodNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotional getLegStreamCommoditySettlPeriodNotional() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodNotional());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodNotional() {
    return isSetField(41690);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure get(quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure getLegStreamCommoditySettlPeriodNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodNotionalUnitOfMeasure() {
    return isSetField(41691);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod get(quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod getLegStreamCommoditySettlPeriodFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodFrequencyPeriod() {
    return isSetField(41692);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit get(quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit getLegStreamCommoditySettlPeriodFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodFrequencyUnit() {
    return isSetField(41693);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPrice get(quickfix.field.LegStreamCommoditySettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPrice getLegStreamCommoditySettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodPrice() {
    return isSetField(41694);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure get(quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure getLegStreamCommoditySettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodPriceUnitOfMeasure() {
    return isSetField(41695);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency get(quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency getLegStreamCommoditySettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodPriceCurrency() {
    return isSetField(41696);
  }

  public void set(quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction get(quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction getLegStreamCommoditySettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlHolidaysProcessingInstruction() {
    return isSetField(41697);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp getLegStreamCommoditySettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp());
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlDays get(quickfix.field.NoLegStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlDays getNoLegStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlDays() {
    return isSetField(41680);
  }

public static class NoLegStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41681, 41682, 41683, 0};

  public NoLegStreamCommoditySettlDays() {
    super(41680, 41681, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDay get(quickfix.field.LegStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDay getLegStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDay() {
    return isSetField(41681);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours get(quickfix.field.LegStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours getLegStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTotalHours() {
    return isSetField(41682);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp getLegStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlTimes get(quickfix.field.NoLegStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlTimes getNoLegStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlTimes() {
    return isSetField(41683);
  }

public static class NoLegStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41684, 41685, 41935, 0};

  public NoLegStreamCommoditySettlTimes() {
    super(41683, 41684, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlStart get(quickfix.field.LegStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlStart getLegStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlStart() {
    return isSetField(41684);
  }

  public void set(quickfix.field.LegStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlEnd get(quickfix.field.LegStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlEnd getLegStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlEnd() {
    return isSetField(41685);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTimeType get(quickfix.field.LegStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTimeType getLegStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTimeType() {
    return isSetField(41935);
  }
}
}

  public void set(quickfix.field.LegStreamCommoditySettlPeriodXID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXID get(quickfix.field.LegStreamCommoditySettlPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXID getLegStreamCommoditySettlPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodXID());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodXID() {
    return isSetField(41698);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXIDRef get(quickfix.field.LegStreamCommoditySettlPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXIDRef getLegStreamCommoditySettlPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodXIDRef() {
    return isSetField(41699);
  }
}

  public void set(quickfix.field.LegStreamCommoditySettlCountry value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlCountry get(quickfix.field.LegStreamCommoditySettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlCountry getLegStreamCommoditySettlCountry() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlCountry());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlCountry() {
    return isSetField(41687);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTimeZone get(quickfix.field.LegStreamCommoditySettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTimeZone getLegStreamCommoditySettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTimeZone());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTimeZone() {
    return isSetField(41688);
  }

  public void set(quickfix.field.LegStreamCommoditySettlFlowType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlFlowType get(quickfix.field.LegStreamCommoditySettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlFlowType getLegStreamCommoditySettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlFlowType());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlFlowType() {
    return isSetField(41689);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodNotional value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotional get(quickfix.field.LegStreamCommoditySettlPeriodNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotional getLegStreamCommoditySettlPeriodNotional() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodNotional());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodNotional() {
    return isSetField(41690);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure get(quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure getLegStreamCommoditySettlPeriodNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodNotionalUnitOfMeasure() {
    return isSetField(41691);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod get(quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod getLegStreamCommoditySettlPeriodFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodFrequencyPeriod() {
    return isSetField(41692);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit get(quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit getLegStreamCommoditySettlPeriodFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodFrequencyUnit() {
    return isSetField(41693);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPrice get(quickfix.field.LegStreamCommoditySettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPrice getLegStreamCommoditySettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodPrice() {
    return isSetField(41694);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure get(quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure getLegStreamCommoditySettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodPriceUnitOfMeasure() {
    return isSetField(41695);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency get(quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency getLegStreamCommoditySettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodPriceCurrency() {
    return isSetField(41696);
  }

  public void set(quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction get(quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction getLegStreamCommoditySettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlHolidaysProcessingInstruction() {
    return isSetField(41697);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp getLegStreamCommoditySettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp());
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlDays get(quickfix.field.NoLegStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlDays getNoLegStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlDays() {
    return isSetField(41680);
  }

public static class NoLegStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41681, 41682, 41683, 0};

  public NoLegStreamCommoditySettlDays() {
    super(41680, 41681, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDay get(quickfix.field.LegStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDay getLegStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDay() {
    return isSetField(41681);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours get(quickfix.field.LegStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours getLegStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTotalHours() {
    return isSetField(41682);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp getLegStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlTimes get(quickfix.field.NoLegStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlTimes getNoLegStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlTimes() {
    return isSetField(41683);
  }

public static class NoLegStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41684, 41685, 41935, 0};

  public NoLegStreamCommoditySettlTimes() {
    super(41683, 41684, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlStart get(quickfix.field.LegStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlStart getLegStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlStart() {
    return isSetField(41684);
  }

  public void set(quickfix.field.LegStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlEnd get(quickfix.field.LegStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlEnd getLegStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlEnd() {
    return isSetField(41685);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTimeType get(quickfix.field.LegStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTimeType getLegStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTimeType() {
    return isSetField(41935);
  }
}
}

  public void set(quickfix.field.LegStreamCommoditySettlPeriodXID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXID get(quickfix.field.LegStreamCommoditySettlPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXID getLegStreamCommoditySettlPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodXID());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodXID() {
    return isSetField(41698);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXIDRef get(quickfix.field.LegStreamCommoditySettlPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXIDRef getLegStreamCommoditySettlPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodXIDRef() {
    return isSetField(41699);
  }
}
