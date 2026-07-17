/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamCommoditySettlPeriodGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41289, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamCommoditySettlPeriodGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamCommoditySettlPeriods value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlPeriods get(quickfix.field.NoStreamCommoditySettlPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlPeriods getNoStreamCommoditySettlPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlPeriods());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlPeriods() {
    return isSetField(41289);
  }

public static class NoStreamCommoditySettlPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41290, 41291, 41292, 41293, 41294, 41295, 41296, 41297, 41298, 41299, 41300, 41283, 41301, 41302, 0};

  public NoStreamCommoditySettlPeriods() {
    super(41289, 41290, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlCountry value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlCountry get(quickfix.field.StreamCommoditySettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlCountry getStreamCommoditySettlCountry() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlCountry());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlCountry() {
    return isSetField(41290);
  }

  public void set(quickfix.field.StreamCommoditySettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTimeZone get(quickfix.field.StreamCommoditySettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTimeZone getStreamCommoditySettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTimeZone());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTimeZone() {
    return isSetField(41291);
  }

  public void set(quickfix.field.StreamCommoditySettlFlowType value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlFlowType get(quickfix.field.StreamCommoditySettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlFlowType getStreamCommoditySettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlFlowType());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlFlowType() {
    return isSetField(41292);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodNotional value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodNotional get(quickfix.field.StreamCommoditySettlPeriodNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodNotional getStreamCommoditySettlPeriodNotional() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodNotional());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodNotional field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodNotional() {
    return isSetField(41293);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure get(quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure getStreamCommoditySettlPeriodNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodNotionalUnitOfMeasure() {
    return isSetField(41294);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod get(quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod getStreamCommoditySettlPeriodFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodFrequencyPeriod() {
    return isSetField(41295);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyUnit get(quickfix.field.StreamCommoditySettlPeriodFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyUnit getStreamCommoditySettlPeriodFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodFrequencyUnit());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodFrequencyUnit() {
    return isSetField(41296);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodPrice get(quickfix.field.StreamCommoditySettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodPrice getStreamCommoditySettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodPrice() {
    return isSetField(41297);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure get(quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure getStreamCommoditySettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodPriceUnitOfMeasure() {
    return isSetField(41298);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceCurrency get(quickfix.field.StreamCommoditySettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceCurrency getStreamCommoditySettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodPriceCurrency() {
    return isSetField(41299);
  }

  public void set(quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction get(quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction getStreamCommoditySettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlHolidaysProcessingInstruction() {
    return isSetField(41300);
  }

  public void set(quickfix.fixlatest.component.StreamCommoditySettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommoditySettlDayGrp get(quickfix.fixlatest.component.StreamCommoditySettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommoditySettlDayGrp getStreamCommoditySettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommoditySettlDayGrp());
  }

  public void set(quickfix.field.NoStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlDays get(quickfix.field.NoStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlDays getNoStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlDays() {
    return isSetField(41283);
  }

public static class NoStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41284, 41285, 41286, 0};

  public NoStreamCommoditySettlDays() {
    super(41283, 41284, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlDay get(quickfix.field.StreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlDay getStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlDay() {
    return isSetField(41284);
  }

  public void set(quickfix.field.StreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTotalHours get(quickfix.field.StreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTotalHours getStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTotalHours() {
    return isSetField(41285);
  }

  public void set(quickfix.fixlatest.component.StreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.StreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommoditySettlTimeGrp getStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlTimes get(quickfix.field.NoStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlTimes getNoStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlTimes() {
    return isSetField(41286);
  }

public static class NoStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41287, 41288, 41588, 0};

  public NoStreamCommoditySettlTimes() {
    super(41286, 41287, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlStart get(quickfix.field.StreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlStart getStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlStart() {
    return isSetField(41287);
  }

  public void set(quickfix.field.StreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlEnd get(quickfix.field.StreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlEnd getStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlEnd() {
    return isSetField(41288);
  }

  public void set(quickfix.field.StreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTimeType get(quickfix.field.StreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTimeType getStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTimeType() {
    return isSetField(41588);
  }
}
}

  public void set(quickfix.field.StreamCommoditySettlPeriodXID value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodXID get(quickfix.field.StreamCommoditySettlPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodXID getStreamCommoditySettlPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodXID());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodXID() {
    return isSetField(41301);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodXIDRef get(quickfix.field.StreamCommoditySettlPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodXIDRef getStreamCommoditySettlPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodXIDRef() {
    return isSetField(41302);
  }
}

  public void set(quickfix.field.StreamCommoditySettlCountry value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlCountry get(quickfix.field.StreamCommoditySettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlCountry getStreamCommoditySettlCountry() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlCountry());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlCountry() {
    return isSetField(41290);
  }

  public void set(quickfix.field.StreamCommoditySettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTimeZone get(quickfix.field.StreamCommoditySettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTimeZone getStreamCommoditySettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTimeZone());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTimeZone() {
    return isSetField(41291);
  }

  public void set(quickfix.field.StreamCommoditySettlFlowType value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlFlowType get(quickfix.field.StreamCommoditySettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlFlowType getStreamCommoditySettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlFlowType());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlFlowType() {
    return isSetField(41292);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodNotional value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodNotional get(quickfix.field.StreamCommoditySettlPeriodNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodNotional getStreamCommoditySettlPeriodNotional() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodNotional());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodNotional field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodNotional() {
    return isSetField(41293);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure get(quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure getStreamCommoditySettlPeriodNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodNotionalUnitOfMeasure() {
    return isSetField(41294);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod get(quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod getStreamCommoditySettlPeriodFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodFrequencyPeriod() {
    return isSetField(41295);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyUnit get(quickfix.field.StreamCommoditySettlPeriodFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyUnit getStreamCommoditySettlPeriodFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodFrequencyUnit());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodFrequencyUnit() {
    return isSetField(41296);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodPrice get(quickfix.field.StreamCommoditySettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodPrice getStreamCommoditySettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodPrice() {
    return isSetField(41297);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure get(quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure getStreamCommoditySettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodPriceUnitOfMeasure() {
    return isSetField(41298);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceCurrency get(quickfix.field.StreamCommoditySettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceCurrency getStreamCommoditySettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodPriceCurrency() {
    return isSetField(41299);
  }

  public void set(quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction get(quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction getStreamCommoditySettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlHolidaysProcessingInstruction() {
    return isSetField(41300);
  }

  public void set(quickfix.fixlatest.component.StreamCommoditySettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommoditySettlDayGrp get(quickfix.fixlatest.component.StreamCommoditySettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommoditySettlDayGrp getStreamCommoditySettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommoditySettlDayGrp());
  }

  public void set(quickfix.field.NoStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlDays get(quickfix.field.NoStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlDays getNoStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlDays() {
    return isSetField(41283);
  }

public static class NoStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41284, 41285, 41286, 0};

  public NoStreamCommoditySettlDays() {
    super(41283, 41284, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlDay get(quickfix.field.StreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlDay getStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlDay() {
    return isSetField(41284);
  }

  public void set(quickfix.field.StreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTotalHours get(quickfix.field.StreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTotalHours getStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTotalHours() {
    return isSetField(41285);
  }

  public void set(quickfix.fixlatest.component.StreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.StreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommoditySettlTimeGrp getStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlTimes get(quickfix.field.NoStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlTimes getNoStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlTimes() {
    return isSetField(41286);
  }

public static class NoStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41287, 41288, 41588, 0};

  public NoStreamCommoditySettlTimes() {
    super(41286, 41287, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlStart get(quickfix.field.StreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlStart getStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlStart() {
    return isSetField(41287);
  }

  public void set(quickfix.field.StreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlEnd get(quickfix.field.StreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlEnd getStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlEnd() {
    return isSetField(41288);
  }

  public void set(quickfix.field.StreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTimeType get(quickfix.field.StreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTimeType getStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTimeType() {
    return isSetField(41588);
  }
}
}

  public void set(quickfix.field.StreamCommoditySettlPeriodXID value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodXID get(quickfix.field.StreamCommoditySettlPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodXID getStreamCommoditySettlPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodXID());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodXID() {
    return isSetField(41301);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodXIDRef get(quickfix.field.StreamCommoditySettlPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodXIDRef getStreamCommoditySettlPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodXIDRef() {
    return isSetField(41302);
  }
}
