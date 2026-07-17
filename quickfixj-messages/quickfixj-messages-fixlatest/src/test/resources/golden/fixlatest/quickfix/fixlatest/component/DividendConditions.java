/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DividendConditions extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42245, 42246, 42247, 42248, 42249, 42250, 42251, 42252, 42253, 42254, 42255, 42256, 42257, 42258, 42259, 42260, 42261, 42262, 42263, 42264, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DividendConditions() {
    super();
  }

  public void set(quickfix.field.DividendReinvestmentIndicator value) {
    setField(value);
  }

  public quickfix.field.DividendReinvestmentIndicator get(quickfix.field.DividendReinvestmentIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendReinvestmentIndicator getDividendReinvestmentIndicator() throws FieldNotFound {
    return get(new quickfix.field.DividendReinvestmentIndicator());
  }

  public boolean isSet(quickfix.field.DividendReinvestmentIndicator field) {
    return isSetField(field);
  }

  public boolean isSetDividendReinvestmentIndicator() {
    return isSetField(42245);
  }

  public void set(quickfix.field.DividendEntitlementEvent value) {
    setField(value);
  }

  public quickfix.field.DividendEntitlementEvent get(quickfix.field.DividendEntitlementEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendEntitlementEvent getDividendEntitlementEvent() throws FieldNotFound {
    return get(new quickfix.field.DividendEntitlementEvent());
  }

  public boolean isSet(quickfix.field.DividendEntitlementEvent field) {
    return isSetField(field);
  }

  public boolean isSetDividendEntitlementEvent() {
    return isSetField(42246);
  }

  public void set(quickfix.field.DividendAmountType value) {
    setField(value);
  }

  public quickfix.field.DividendAmountType get(quickfix.field.DividendAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAmountType getDividendAmountType() throws FieldNotFound {
    return get(new quickfix.field.DividendAmountType());
  }

  public boolean isSet(quickfix.field.DividendAmountType field) {
    return isSetField(field);
  }

  public boolean isSetDividendAmountType() {
    return isSetField(42247);
  }

  public void set(quickfix.field.DividendUnderlierRefID value) {
    setField(value);
  }

  public quickfix.field.DividendUnderlierRefID get(quickfix.field.DividendUnderlierRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendUnderlierRefID getDividendUnderlierRefID() throws FieldNotFound {
    return get(new quickfix.field.DividendUnderlierRefID());
  }

  public boolean isSet(quickfix.field.DividendUnderlierRefID field) {
    return isSetField(field);
  }

  public boolean isSetDividendUnderlierRefID() {
    return isSetField(42248);
  }

  public void set(quickfix.fixlatest.component.DividendPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DividendPeriodGrp get(quickfix.fixlatest.component.DividendPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DividendPeriodGrp getDividendPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DividendPeriodGrp());
  }

  public void set(quickfix.field.NoDividendPeriods value) {
    setField(value);
  }

  public quickfix.field.NoDividendPeriods get(quickfix.field.NoDividendPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDividendPeriods getNoDividendPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoDividendPeriods());
  }

  public boolean isSet(quickfix.field.NoDividendPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoDividendPeriods() {
    return isSetField(42274);
  }

public static class NoDividendPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42275, 42276, 42277, 42278, 42279, 42280, 42294, 42281, 42282, 42283, 42284, 42285, 42286, 42287, 42288, 42289, 42290, 42291, 42292, 42293, 0};

  public NoDividendPeriods() {
    super(42274, 42275, ORDER);
  }

  public void set(quickfix.field.DividendPeriodSequence value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodSequence get(quickfix.field.DividendPeriodSequence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodSequence getDividendPeriodSequence() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodSequence());
  }

  public boolean isSet(quickfix.field.DividendPeriodSequence field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodSequence() {
    return isSetField(42275);
  }

  public void set(quickfix.field.DividendPeriodStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodStartDateUnadjusted get(quickfix.field.DividendPeriodStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodStartDateUnadjusted getDividendPeriodStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.DividendPeriodStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodStartDateUnadjusted() {
    return isSetField(42276);
  }

  public void set(quickfix.field.DividendPeriodEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodEndDateUnadjusted get(quickfix.field.DividendPeriodEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodEndDateUnadjusted getDividendPeriodEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.DividendPeriodEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodEndDateUnadjusted() {
    return isSetField(42277);
  }

  public void set(quickfix.field.DividendPeriodUnderlierRefID value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodUnderlierRefID get(quickfix.field.DividendPeriodUnderlierRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodUnderlierRefID getDividendPeriodUnderlierRefID() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodUnderlierRefID());
  }

  public boolean isSet(quickfix.field.DividendPeriodUnderlierRefID field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodUnderlierRefID() {
    return isSetField(42278);
  }

  public void set(quickfix.field.DividendPeriodStrikePrice value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodStrikePrice get(quickfix.field.DividendPeriodStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodStrikePrice getDividendPeriodStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodStrikePrice());
  }

  public boolean isSet(quickfix.field.DividendPeriodStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodStrikePrice() {
    return isSetField(42279);
  }

  public void set(quickfix.field.DividendPeriodBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodBusinessDayConvention get(quickfix.field.DividendPeriodBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodBusinessDayConvention getDividendPeriodBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.DividendPeriodBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodBusinessDayConvention() {
    return isSetField(42280);
  }

  public void set(quickfix.fixlatest.component.DividendPeriodBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DividendPeriodBusinessCenterGrp get(quickfix.fixlatest.component.DividendPeriodBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DividendPeriodBusinessCenterGrp getDividendPeriodBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DividendPeriodBusinessCenterGrp());
  }

  public void set(quickfix.field.NoDividendPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoDividendPeriodBusinessCenters get(quickfix.field.NoDividendPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDividendPeriodBusinessCenters getNoDividendPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoDividendPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoDividendPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoDividendPeriodBusinessCenters() {
    return isSetField(42294);
  }

public static class NoDividendPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42295, 0};

  public NoDividendPeriodBusinessCenters() {
    super(42294, 42295, ORDER);
  }

  public void set(quickfix.field.DividendPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodBusinessCenter get(quickfix.field.DividendPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodBusinessCenter getDividendPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.DividendPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodBusinessCenter() {
    return isSetField(42295);
  }
}

  public void set(quickfix.field.DividendPeriodValuationDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodValuationDateUnadjusted get(quickfix.field.DividendPeriodValuationDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodValuationDateUnadjusted getDividendPeriodValuationDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodValuationDateUnadjusted());
  }

  public boolean isSet(quickfix.field.DividendPeriodValuationDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodValuationDateUnadjusted() {
    return isSetField(42281);
  }

  public void set(quickfix.field.DividendPeriodValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodValuationDateRelativeTo get(quickfix.field.DividendPeriodValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodValuationDateRelativeTo getDividendPeriodValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.DividendPeriodValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodValuationDateRelativeTo() {
    return isSetField(42282);
  }

  public void set(quickfix.field.DividendPeriodValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodValuationDateOffsetPeriod get(quickfix.field.DividendPeriodValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodValuationDateOffsetPeriod getDividendPeriodValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.DividendPeriodValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodValuationDateOffsetPeriod() {
    return isSetField(42283);
  }

  public void set(quickfix.field.DividendPeriodValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodValuationDateOffsetUnit get(quickfix.field.DividendPeriodValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodValuationDateOffsetUnit getDividendPeriodValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.DividendPeriodValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodValuationDateOffsetUnit() {
    return isSetField(42284);
  }

  public void set(quickfix.field.DividendPeriodValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodValuationDateOffsetDayType get(quickfix.field.DividendPeriodValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodValuationDateOffsetDayType getDividendPeriodValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.DividendPeriodValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodValuationDateOffsetDayType() {
    return isSetField(42285);
  }

  public void set(quickfix.field.DividendPeriodValuationDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodValuationDateAdjusted get(quickfix.field.DividendPeriodValuationDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodValuationDateAdjusted getDividendPeriodValuationDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodValuationDateAdjusted());
  }

  public boolean isSet(quickfix.field.DividendPeriodValuationDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodValuationDateAdjusted() {
    return isSetField(42286);
  }

  public void set(quickfix.field.DividendPeriodPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodPaymentDateUnadjusted get(quickfix.field.DividendPeriodPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodPaymentDateUnadjusted getDividendPeriodPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.DividendPeriodPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodPaymentDateUnadjusted() {
    return isSetField(42287);
  }

  public void set(quickfix.field.DividendPeriodPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodPaymentDateRelativeTo get(quickfix.field.DividendPeriodPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodPaymentDateRelativeTo getDividendPeriodPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.DividendPeriodPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodPaymentDateRelativeTo() {
    return isSetField(42288);
  }

  public void set(quickfix.field.DividendPeriodPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodPaymentDateOffsetPeriod get(quickfix.field.DividendPeriodPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodPaymentDateOffsetPeriod getDividendPeriodPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.DividendPeriodPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodPaymentDateOffsetPeriod() {
    return isSetField(42289);
  }

  public void set(quickfix.field.DividendPeriodPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodPaymentDateOffsetUnit get(quickfix.field.DividendPeriodPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodPaymentDateOffsetUnit getDividendPeriodPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.DividendPeriodPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodPaymentDateOffsetUnit() {
    return isSetField(42290);
  }

  public void set(quickfix.field.DividendPeriodPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodPaymentDateOffsetDayType get(quickfix.field.DividendPeriodPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodPaymentDateOffsetDayType getDividendPeriodPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.DividendPeriodPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodPaymentDateOffsetDayType() {
    return isSetField(42291);
  }

  public void set(quickfix.field.DividendPeriodPaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodPaymentDateAdjusted get(quickfix.field.DividendPeriodPaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodPaymentDateAdjusted getDividendPeriodPaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodPaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.DividendPeriodPaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodPaymentDateAdjusted() {
    return isSetField(42292);
  }

  public void set(quickfix.field.DividendPeriodXID value) {
    setField(value);
  }

  public quickfix.field.DividendPeriodXID get(quickfix.field.DividendPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendPeriodXID getDividendPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.DividendPeriodXID());
  }

  public boolean isSet(quickfix.field.DividendPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetDividendPeriodXID() {
    return isSetField(42293);
  }
}

  public void set(quickfix.field.ExtraordinaryDividendPartySide value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryDividendPartySide get(quickfix.field.ExtraordinaryDividendPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryDividendPartySide getExtraordinaryDividendPartySide() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryDividendPartySide());
  }

  public boolean isSet(quickfix.field.ExtraordinaryDividendPartySide field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryDividendPartySide() {
    return isSetField(42249);
  }

  public void set(quickfix.field.ExtraordinaryDividendAmountType value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryDividendAmountType get(quickfix.field.ExtraordinaryDividendAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryDividendAmountType getExtraordinaryDividendAmountType() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryDividendAmountType());
  }

  public boolean isSet(quickfix.field.ExtraordinaryDividendAmountType field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryDividendAmountType() {
    return isSetField(42250);
  }

  public void set(quickfix.field.ExtraordinaryDividendCurrency value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryDividendCurrency get(quickfix.field.ExtraordinaryDividendCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryDividendCurrency getExtraordinaryDividendCurrency() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryDividendCurrency());
  }

  public boolean isSet(quickfix.field.ExtraordinaryDividendCurrency field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryDividendCurrency() {
    return isSetField(42251);
  }

  public void set(quickfix.field.ExtraordinaryDividendDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.ExtraordinaryDividendDeterminationMethod get(quickfix.field.ExtraordinaryDividendDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExtraordinaryDividendDeterminationMethod getExtraordinaryDividendDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.ExtraordinaryDividendDeterminationMethod());
  }

  public boolean isSet(quickfix.field.ExtraordinaryDividendDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetExtraordinaryDividendDeterminationMethod() {
    return isSetField(42252);
  }

  public void set(quickfix.fixlatest.component.DividendFXTriggerDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DividendFXTriggerDate get(quickfix.fixlatest.component.DividendFXTriggerDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DividendFXTriggerDate getDividendFXTriggerDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DividendFXTriggerDate());
  }

  public void set(quickfix.fixlatest.component.DividendAccrualFloatingRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DividendAccrualFloatingRate get(quickfix.fixlatest.component.DividendAccrualFloatingRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DividendAccrualFloatingRate getDividendAccrualFloatingRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DividendAccrualFloatingRate());
  }

  public void set(quickfix.field.DividendAccrualFixedRate value) {
    setField(value);
  }

  public quickfix.field.DividendAccrualFixedRate get(quickfix.field.DividendAccrualFixedRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendAccrualFixedRate getDividendAccrualFixedRate() throws FieldNotFound {
    return get(new quickfix.field.DividendAccrualFixedRate());
  }

  public boolean isSet(quickfix.field.DividendAccrualFixedRate field) {
    return isSetField(field);
  }

  public boolean isSetDividendAccrualFixedRate() {
    return isSetField(42253);
  }

  public void set(quickfix.fixlatest.component.DividendAccrualPaymentDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DividendAccrualPaymentDate get(quickfix.fixlatest.component.DividendAccrualPaymentDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DividendAccrualPaymentDate getDividendAccrualPaymentDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DividendAccrualPaymentDate());
  }

  public void set(quickfix.field.DividendCompoundingMethod value) {
    setField(value);
  }

  public quickfix.field.DividendCompoundingMethod get(quickfix.field.DividendCompoundingMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendCompoundingMethod getDividendCompoundingMethod() throws FieldNotFound {
    return get(new quickfix.field.DividendCompoundingMethod());
  }

  public boolean isSet(quickfix.field.DividendCompoundingMethod field) {
    return isSetField(field);
  }

  public boolean isSetDividendCompoundingMethod() {
    return isSetField(42254);
  }

  public void set(quickfix.field.DividendNumOfIndexUnits value) {
    setField(value);
  }

  public quickfix.field.DividendNumOfIndexUnits get(quickfix.field.DividendNumOfIndexUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendNumOfIndexUnits getDividendNumOfIndexUnits() throws FieldNotFound {
    return get(new quickfix.field.DividendNumOfIndexUnits());
  }

  public boolean isSet(quickfix.field.DividendNumOfIndexUnits field) {
    return isSetField(field);
  }

  public boolean isSetDividendNumOfIndexUnits() {
    return isSetField(42255);
  }

  public void set(quickfix.field.DividendCashPercentage value) {
    setField(value);
  }

  public quickfix.field.DividendCashPercentage get(quickfix.field.DividendCashPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendCashPercentage getDividendCashPercentage() throws FieldNotFound {
    return get(new quickfix.field.DividendCashPercentage());
  }

  public boolean isSet(quickfix.field.DividendCashPercentage field) {
    return isSetField(field);
  }

  public boolean isSetDividendCashPercentage() {
    return isSetField(42256);
  }

  public void set(quickfix.field.DividendCashEquivalentPercentage value) {
    setField(value);
  }

  public quickfix.field.DividendCashEquivalentPercentage get(quickfix.field.DividendCashEquivalentPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendCashEquivalentPercentage getDividendCashEquivalentPercentage() throws FieldNotFound {
    return get(new quickfix.field.DividendCashEquivalentPercentage());
  }

  public boolean isSet(quickfix.field.DividendCashEquivalentPercentage field) {
    return isSetField(field);
  }

  public boolean isSetDividendCashEquivalentPercentage() {
    return isSetField(42257);
  }

  public void set(quickfix.field.NonCashDividendTreatment value) {
    setField(value);
  }

  public quickfix.field.NonCashDividendTreatment get(quickfix.field.NonCashDividendTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NonCashDividendTreatment getNonCashDividendTreatment() throws FieldNotFound {
    return get(new quickfix.field.NonCashDividendTreatment());
  }

  public boolean isSet(quickfix.field.NonCashDividendTreatment field) {
    return isSetField(field);
  }

  public boolean isSetNonCashDividendTreatment() {
    return isSetField(42258);
  }

  public void set(quickfix.field.DividendComposition value) {
    setField(value);
  }

  public quickfix.field.DividendComposition get(quickfix.field.DividendComposition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendComposition getDividendComposition() throws FieldNotFound {
    return get(new quickfix.field.DividendComposition());
  }

  public boolean isSet(quickfix.field.DividendComposition field) {
    return isSetField(field);
  }

  public boolean isSetDividendComposition() {
    return isSetField(42259);
  }

  public void set(quickfix.field.SpecialDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.SpecialDividendsIndicator get(quickfix.field.SpecialDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SpecialDividendsIndicator getSpecialDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.SpecialDividendsIndicator());
  }

  public boolean isSet(quickfix.field.SpecialDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSpecialDividendsIndicator() {
    return isSetField(42260);
  }

  public void set(quickfix.field.MaterialDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.MaterialDividendsIndicator get(quickfix.field.MaterialDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaterialDividendsIndicator getMaterialDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.MaterialDividendsIndicator());
  }

  public boolean isSet(quickfix.field.MaterialDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetMaterialDividendsIndicator() {
    return isSetField(42261);
  }

  public void set(quickfix.field.OptionsExchangeDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.OptionsExchangeDividendsIndicator get(quickfix.field.OptionsExchangeDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OptionsExchangeDividendsIndicator getOptionsExchangeDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.OptionsExchangeDividendsIndicator());
  }

  public boolean isSet(quickfix.field.OptionsExchangeDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetOptionsExchangeDividendsIndicator() {
    return isSetField(42262);
  }

  public void set(quickfix.field.AdditionalDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.AdditionalDividendsIndicator get(quickfix.field.AdditionalDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalDividendsIndicator getAdditionalDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.AdditionalDividendsIndicator());
  }

  public boolean isSet(quickfix.field.AdditionalDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalDividendsIndicator() {
    return isSetField(42263);
  }

  public void set(quickfix.field.AllDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.AllDividendsIndicator get(quickfix.field.AllDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AllDividendsIndicator getAllDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.AllDividendsIndicator());
  }

  public boolean isSet(quickfix.field.AllDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetAllDividendsIndicator() {
    return isSetField(42264);
  }
}
