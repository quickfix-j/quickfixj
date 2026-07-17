/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCommoditySettlPeriodGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42002, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCommoditySettlPeriodGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlPeriods value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlPeriods get(quickfix.field.NoUnderlyingStreamCommoditySettlPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlPeriods getNoUnderlyingStreamCommoditySettlPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlPeriods());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlPeriods() {
    return isSetField(42002);
  }

public static class NoUnderlyingStreamCommoditySettlPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42003, 42004, 42005, 42006, 42007, 42008, 42009, 42010, 42011, 42012, 42013, 41996, 42014, 42015, 0};

  public NoUnderlyingStreamCommoditySettlPeriods() {
    super(42002, 42003, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlCountry value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlCountry get(quickfix.field.UnderlyingStreamCommoditySettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlCountry getUnderlyingStreamCommoditySettlCountry() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlCountry());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlCountry() {
    return isSetField(42003);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeZone get(quickfix.field.UnderlyingStreamCommoditySettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeZone getUnderlyingStreamCommoditySettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeZone());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeZone() {
    return isSetField(42004);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlFlowType get(quickfix.field.UnderlyingStreamCommoditySettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlFlowType getUnderlyingStreamCommoditySettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlFlowType() {
    return isSetField(42005);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional get(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional getUnderlyingStreamCommoditySettlPeriodNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodNotional() {
    return isSetField(42006);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure get(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure getUnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure() {
    return isSetField(42007);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod get(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod getUnderlyingStreamCommoditySettlPeriodFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodFrequencyPeriod() {
    return isSetField(42008);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit get(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit getUnderlyingStreamCommoditySettlPeriodFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodFrequencyUnit() {
    return isSetField(42009);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice get(quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice getUnderlyingStreamCommoditySettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodPrice() {
    return isSetField(42010);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure get(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure getUnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure() {
    return isSetField(42011);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency get(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency getUnderlyingStreamCommoditySettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodPriceCurrency() {
    return isSetField(42012);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction get(quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction getUnderlyingStreamCommoditySettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlHolidaysProcessingInstruction() {
    return isSetField(42013);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp getUnderlyingStreamCommoditySettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlDays get(quickfix.field.NoUnderlyingStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlDays getNoUnderlyingStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlDays() {
    return isSetField(41996);
  }

public static class NoUnderlyingStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41997, 41998, 41999, 0};

  public NoUnderlyingStreamCommoditySettlDays() {
    super(41996, 41997, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay get(quickfix.field.UnderlyingStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay getUnderlyingStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDay() {
    return isSetField(41997);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours get(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours getUnderlyingStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTotalHours() {
    return isSetField(41998);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp getUnderlyingStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes get(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes getNoUnderlyingStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlTimes() {
    return isSetField(41999);
  }

public static class NoUnderlyingStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42000, 42001, 41936, 0};

  public NoUnderlyingStreamCommoditySettlTimes() {
    super(41999, 42000, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart get(quickfix.field.UnderlyingStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart getUnderlyingStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlStart() {
    return isSetField(42000);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd get(quickfix.field.UnderlyingStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd getUnderlyingStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlEnd() {
    return isSetField(42001);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType get(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType getUnderlyingStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeType() {
    return isSetField(41936);
  }
}
}

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXID get(quickfix.field.UnderlyingStreamCommoditySettlPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXID getUnderlyingStreamCommoditySettlPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodXID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodXID() {
    return isSetField(42014);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef get(quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef getUnderlyingStreamCommoditySettlPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodXIDRef() {
    return isSetField(42015);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommoditySettlCountry value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlCountry get(quickfix.field.UnderlyingStreamCommoditySettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlCountry getUnderlyingStreamCommoditySettlCountry() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlCountry());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlCountry() {
    return isSetField(42003);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeZone get(quickfix.field.UnderlyingStreamCommoditySettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeZone getUnderlyingStreamCommoditySettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeZone());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeZone() {
    return isSetField(42004);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlFlowType get(quickfix.field.UnderlyingStreamCommoditySettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlFlowType getUnderlyingStreamCommoditySettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlFlowType() {
    return isSetField(42005);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional get(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional getUnderlyingStreamCommoditySettlPeriodNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodNotional() {
    return isSetField(42006);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure get(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure getUnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure() {
    return isSetField(42007);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod get(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod getUnderlyingStreamCommoditySettlPeriodFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodFrequencyPeriod() {
    return isSetField(42008);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit get(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit getUnderlyingStreamCommoditySettlPeriodFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodFrequencyUnit() {
    return isSetField(42009);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice get(quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice getUnderlyingStreamCommoditySettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodPrice() {
    return isSetField(42010);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure get(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure getUnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure() {
    return isSetField(42011);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency get(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency getUnderlyingStreamCommoditySettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodPriceCurrency() {
    return isSetField(42012);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction get(quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction getUnderlyingStreamCommoditySettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlHolidaysProcessingInstruction() {
    return isSetField(42013);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp getUnderlyingStreamCommoditySettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlDays get(quickfix.field.NoUnderlyingStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlDays getNoUnderlyingStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlDays() {
    return isSetField(41996);
  }

public static class NoUnderlyingStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41997, 41998, 41999, 0};

  public NoUnderlyingStreamCommoditySettlDays() {
    super(41996, 41997, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay get(quickfix.field.UnderlyingStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay getUnderlyingStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDay() {
    return isSetField(41997);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours get(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours getUnderlyingStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTotalHours() {
    return isSetField(41998);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp getUnderlyingStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes get(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes getNoUnderlyingStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlTimes() {
    return isSetField(41999);
  }

public static class NoUnderlyingStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42000, 42001, 41936, 0};

  public NoUnderlyingStreamCommoditySettlTimes() {
    super(41999, 42000, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart get(quickfix.field.UnderlyingStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart getUnderlyingStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlStart() {
    return isSetField(42000);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd get(quickfix.field.UnderlyingStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd getUnderlyingStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlEnd() {
    return isSetField(42001);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType get(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType getUnderlyingStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeType() {
    return isSetField(41936);
  }
}
}

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXID get(quickfix.field.UnderlyingStreamCommoditySettlPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXID getUnderlyingStreamCommoditySettlPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodXID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodXID() {
    return isSetField(42014);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef get(quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef getUnderlyingStreamCommoditySettlPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodXIDRef() {
    return isSetField(42015);
  }
}
