/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDividendConditions extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42337, 42338, 42339, 42340, 42341, 42342, 42343, 42344, 42345, 42346, 42347, 42348, 42349, 42350, 42351, 42352, 42353, 42354, 42355, 42356, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegDividendConditions() {
    super();
  }

  public void set(quickfix.field.LegDividendReinvestmentIndicator value) {
    setField(value);
  }

  public quickfix.field.LegDividendReinvestmentIndicator get(quickfix.field.LegDividendReinvestmentIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendReinvestmentIndicator getLegDividendReinvestmentIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegDividendReinvestmentIndicator());
  }

  public boolean isSet(quickfix.field.LegDividendReinvestmentIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendReinvestmentIndicator() {
    return isSetField(42337);
  }

  public void set(quickfix.field.LegDividendEntitlementEvent value) {
    setField(value);
  }

  public quickfix.field.LegDividendEntitlementEvent get(quickfix.field.LegDividendEntitlementEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendEntitlementEvent getLegDividendEntitlementEvent() throws FieldNotFound {
    return get(new quickfix.field.LegDividendEntitlementEvent());
  }

  public boolean isSet(quickfix.field.LegDividendEntitlementEvent field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendEntitlementEvent() {
    return isSetField(42338);
  }

  public void set(quickfix.field.LegDividendAmountType value) {
    setField(value);
  }

  public quickfix.field.LegDividendAmountType get(quickfix.field.LegDividendAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAmountType getLegDividendAmountType() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAmountType());
  }

  public boolean isSet(quickfix.field.LegDividendAmountType field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAmountType() {
    return isSetField(42339);
  }

  public void set(quickfix.field.LegDividendUnderlierRefID value) {
    setField(value);
  }

  public quickfix.field.LegDividendUnderlierRefID get(quickfix.field.LegDividendUnderlierRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendUnderlierRefID getLegDividendUnderlierRefID() throws FieldNotFound {
    return get(new quickfix.field.LegDividendUnderlierRefID());
  }

  public boolean isSet(quickfix.field.LegDividendUnderlierRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendUnderlierRefID() {
    return isSetField(42340);
  }

  public void set(quickfix.fixlatest.component.LegDividendPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDividendPeriodGrp get(quickfix.fixlatest.component.LegDividendPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDividendPeriodGrp getLegDividendPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDividendPeriodGrp());
  }

  public void set(quickfix.field.NoLegDividendPeriods value) {
    setField(value);
  }

  public quickfix.field.NoLegDividendPeriods get(quickfix.field.NoLegDividendPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDividendPeriods getNoLegDividendPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoLegDividendPeriods());
  }

  public boolean isSet(quickfix.field.NoLegDividendPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDividendPeriods() {
    return isSetField(42366);
  }

public static class NoLegDividendPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42367, 42368, 42369, 42370, 42371, 42372, 42386, 42373, 42374, 42375, 42376, 42377, 42378, 42379, 42380, 42381, 42382, 42383, 42384, 42385, 0};

  public NoLegDividendPeriods() {
    super(42366, 42367, ORDER);
  }

  public void set(quickfix.field.LegDividendPeriodSequence value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodSequence get(quickfix.field.LegDividendPeriodSequence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodSequence getLegDividendPeriodSequence() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodSequence());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodSequence field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodSequence() {
    return isSetField(42367);
  }

  public void set(quickfix.field.LegDividendPeriodStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodStartDateUnadjusted get(quickfix.field.LegDividendPeriodStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodStartDateUnadjusted getLegDividendPeriodStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodStartDateUnadjusted() {
    return isSetField(42368);
  }

  public void set(quickfix.field.LegDividendPeriodEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodEndDateUnadjusted get(quickfix.field.LegDividendPeriodEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodEndDateUnadjusted getLegDividendPeriodEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodEndDateUnadjusted() {
    return isSetField(42369);
  }

  public void set(quickfix.field.LegDividendPeriodUnderlierRefID value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodUnderlierRefID get(quickfix.field.LegDividendPeriodUnderlierRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodUnderlierRefID getLegDividendPeriodUnderlierRefID() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodUnderlierRefID());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodUnderlierRefID field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodUnderlierRefID() {
    return isSetField(42370);
  }

  public void set(quickfix.field.LegDividendPeriodStrikePrice value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodStrikePrice get(quickfix.field.LegDividendPeriodStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodStrikePrice getLegDividendPeriodStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodStrikePrice());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodStrikePrice() {
    return isSetField(42371);
  }

  public void set(quickfix.field.LegDividendPeriodBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodBusinessDayConvention get(quickfix.field.LegDividendPeriodBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodBusinessDayConvention getLegDividendPeriodBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodBusinessDayConvention() {
    return isSetField(42372);
  }

  public void set(quickfix.fixlatest.component.LegDividendPeriodBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDividendPeriodBusinessCenterGrp get(quickfix.fixlatest.component.LegDividendPeriodBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDividendPeriodBusinessCenterGrp getLegDividendPeriodBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDividendPeriodBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegDividendPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegDividendPeriodBusinessCenters get(quickfix.field.NoLegDividendPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDividendPeriodBusinessCenters getNoLegDividendPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegDividendPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegDividendPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDividendPeriodBusinessCenters() {
    return isSetField(42386);
  }

public static class NoLegDividendPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42387, 0};

  public NoLegDividendPeriodBusinessCenters() {
    super(42386, 42387, ORDER);
  }

  public void set(quickfix.field.LegDividendPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodBusinessCenter get(quickfix.field.LegDividendPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodBusinessCenter getLegDividendPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodBusinessCenter() {
    return isSetField(42387);
  }
}

  public void set(quickfix.field.LegDividendPeriodValuationDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodValuationDateUnadjusted get(quickfix.field.LegDividendPeriodValuationDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodValuationDateUnadjusted getLegDividendPeriodValuationDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodValuationDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodValuationDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodValuationDateUnadjusted() {
    return isSetField(42373);
  }

  public void set(quickfix.field.LegDividendPeriodValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodValuationDateRelativeTo get(quickfix.field.LegDividendPeriodValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodValuationDateRelativeTo getLegDividendPeriodValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodValuationDateRelativeTo() {
    return isSetField(42374);
  }

  public void set(quickfix.field.LegDividendPeriodValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodValuationDateOffsetPeriod get(quickfix.field.LegDividendPeriodValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodValuationDateOffsetPeriod getLegDividendPeriodValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodValuationDateOffsetPeriod() {
    return isSetField(42375);
  }

  public void set(quickfix.field.LegDividendPeriodValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodValuationDateOffsetUnit get(quickfix.field.LegDividendPeriodValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodValuationDateOffsetUnit getLegDividendPeriodValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodValuationDateOffsetUnit() {
    return isSetField(42376);
  }

  public void set(quickfix.field.LegDividendPeriodValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodValuationDateOffsetDayType get(quickfix.field.LegDividendPeriodValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodValuationDateOffsetDayType getLegDividendPeriodValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodValuationDateOffsetDayType() {
    return isSetField(42377);
  }

  public void set(quickfix.field.LegDividendPeriodValuationDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodValuationDateAdjusted get(quickfix.field.LegDividendPeriodValuationDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodValuationDateAdjusted getLegDividendPeriodValuationDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodValuationDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodValuationDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodValuationDateAdjusted() {
    return isSetField(42378);
  }

  public void set(quickfix.field.LegDividendPeriodPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodPaymentDateUnadjusted get(quickfix.field.LegDividendPeriodPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodPaymentDateUnadjusted getLegDividendPeriodPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodPaymentDateUnadjusted() {
    return isSetField(42379);
  }

  public void set(quickfix.field.LegDividendPeriodPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodPaymentDateRelativeTo get(quickfix.field.LegDividendPeriodPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodPaymentDateRelativeTo getLegDividendPeriodPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodPaymentDateRelativeTo() {
    return isSetField(42380);
  }

  public void set(quickfix.field.LegDividendPeriodPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodPaymentDateOffsetPeriod get(quickfix.field.LegDividendPeriodPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodPaymentDateOffsetPeriod getLegDividendPeriodPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodPaymentDateOffsetPeriod() {
    return isSetField(42381);
  }

  public void set(quickfix.field.LegDividendPeriodPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodPaymentDateOffsetUnit get(quickfix.field.LegDividendPeriodPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodPaymentDateOffsetUnit getLegDividendPeriodPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodPaymentDateOffsetUnit() {
    return isSetField(42382);
  }

  public void set(quickfix.field.LegDividendPeriodPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodPaymentDateOffsetDayType get(quickfix.field.LegDividendPeriodPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodPaymentDateOffsetDayType getLegDividendPeriodPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodPaymentDateOffsetDayType() {
    return isSetField(42383);
  }

  public void set(quickfix.field.LegDividendPeriodPaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodPaymentDateAdjusted get(quickfix.field.LegDividendPeriodPaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodPaymentDateAdjusted getLegDividendPeriodPaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodPaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodPaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodPaymentDateAdjusted() {
    return isSetField(42384);
  }

  public void set(quickfix.field.LegDividendPeriodXID value) {
    setField(value);
  }

  public quickfix.field.LegDividendPeriodXID get(quickfix.field.LegDividendPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendPeriodXID getLegDividendPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.LegDividendPeriodXID());
  }

  public boolean isSet(quickfix.field.LegDividendPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendPeriodXID() {
    return isSetField(42385);
  }
}

  public void set(quickfix.field.LegExtraordinaryDividendPartySide value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryDividendPartySide get(quickfix.field.LegExtraordinaryDividendPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryDividendPartySide getLegExtraordinaryDividendPartySide() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryDividendPartySide());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryDividendPartySide field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryDividendPartySide() {
    return isSetField(42341);
  }

  public void set(quickfix.field.LegExtraordinaryDividendAmountType value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryDividendAmountType get(quickfix.field.LegExtraordinaryDividendAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryDividendAmountType getLegExtraordinaryDividendAmountType() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryDividendAmountType());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryDividendAmountType field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryDividendAmountType() {
    return isSetField(42342);
  }

  public void set(quickfix.field.LegExtraordinaryDividendCurrency value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryDividendCurrency get(quickfix.field.LegExtraordinaryDividendCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryDividendCurrency getLegExtraordinaryDividendCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryDividendCurrency());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryDividendCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryDividendCurrency() {
    return isSetField(42343);
  }

  public void set(quickfix.field.LegExtraordinaryDividendDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegExtraordinaryDividendDeterminationMethod get(quickfix.field.LegExtraordinaryDividendDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegExtraordinaryDividendDeterminationMethod getLegExtraordinaryDividendDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegExtraordinaryDividendDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegExtraordinaryDividendDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegExtraordinaryDividendDeterminationMethod() {
    return isSetField(42344);
  }

  public void set(quickfix.fixlatest.component.LegDividendFXTriggerDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDividendFXTriggerDate get(quickfix.fixlatest.component.LegDividendFXTriggerDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDividendFXTriggerDate getLegDividendFXTriggerDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDividendFXTriggerDate());
  }

  public void set(quickfix.fixlatest.component.LegDividendAccrualFloatingRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDividendAccrualFloatingRate get(quickfix.fixlatest.component.LegDividendAccrualFloatingRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDividendAccrualFloatingRate getLegDividendAccrualFloatingRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDividendAccrualFloatingRate());
  }

  public void set(quickfix.field.LegDividendAccrualFixedRate value) {
    setField(value);
  }

  public quickfix.field.LegDividendAccrualFixedRate get(quickfix.field.LegDividendAccrualFixedRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendAccrualFixedRate getLegDividendAccrualFixedRate() throws FieldNotFound {
    return get(new quickfix.field.LegDividendAccrualFixedRate());
  }

  public boolean isSet(quickfix.field.LegDividendAccrualFixedRate field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendAccrualFixedRate() {
    return isSetField(42345);
  }

  public void set(quickfix.fixlatest.component.LegDividendAccrualPaymentDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDividendAccrualPaymentDate get(quickfix.fixlatest.component.LegDividendAccrualPaymentDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDividendAccrualPaymentDate getLegDividendAccrualPaymentDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDividendAccrualPaymentDate());
  }

  public void set(quickfix.field.LegDividendCompoundingMethod value) {
    setField(value);
  }

  public quickfix.field.LegDividendCompoundingMethod get(quickfix.field.LegDividendCompoundingMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendCompoundingMethod getLegDividendCompoundingMethod() throws FieldNotFound {
    return get(new quickfix.field.LegDividendCompoundingMethod());
  }

  public boolean isSet(quickfix.field.LegDividendCompoundingMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendCompoundingMethod() {
    return isSetField(42346);
  }

  public void set(quickfix.field.LegDividendNumOfIndexUnits value) {
    setField(value);
  }

  public quickfix.field.LegDividendNumOfIndexUnits get(quickfix.field.LegDividendNumOfIndexUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendNumOfIndexUnits getLegDividendNumOfIndexUnits() throws FieldNotFound {
    return get(new quickfix.field.LegDividendNumOfIndexUnits());
  }

  public boolean isSet(quickfix.field.LegDividendNumOfIndexUnits field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendNumOfIndexUnits() {
    return isSetField(42347);
  }

  public void set(quickfix.field.LegDividendCashPercentage value) {
    setField(value);
  }

  public quickfix.field.LegDividendCashPercentage get(quickfix.field.LegDividendCashPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendCashPercentage getLegDividendCashPercentage() throws FieldNotFound {
    return get(new quickfix.field.LegDividendCashPercentage());
  }

  public boolean isSet(quickfix.field.LegDividendCashPercentage field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendCashPercentage() {
    return isSetField(42348);
  }

  public void set(quickfix.field.LegDividendCashEquivalentPercentage value) {
    setField(value);
  }

  public quickfix.field.LegDividendCashEquivalentPercentage get(quickfix.field.LegDividendCashEquivalentPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendCashEquivalentPercentage getLegDividendCashEquivalentPercentage() throws FieldNotFound {
    return get(new quickfix.field.LegDividendCashEquivalentPercentage());
  }

  public boolean isSet(quickfix.field.LegDividendCashEquivalentPercentage field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendCashEquivalentPercentage() {
    return isSetField(42349);
  }

  public void set(quickfix.field.LegNonCashDividendTreatment value) {
    setField(value);
  }

  public quickfix.field.LegNonCashDividendTreatment get(quickfix.field.LegNonCashDividendTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNonCashDividendTreatment getLegNonCashDividendTreatment() throws FieldNotFound {
    return get(new quickfix.field.LegNonCashDividendTreatment());
  }

  public boolean isSet(quickfix.field.LegNonCashDividendTreatment field) {
    return isSetField(field);
  }

  public boolean isSetLegNonCashDividendTreatment() {
    return isSetField(42350);
  }

  public void set(quickfix.field.LegDividendComposition value) {
    setField(value);
  }

  public quickfix.field.LegDividendComposition get(quickfix.field.LegDividendComposition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendComposition getLegDividendComposition() throws FieldNotFound {
    return get(new quickfix.field.LegDividendComposition());
  }

  public boolean isSet(quickfix.field.LegDividendComposition field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendComposition() {
    return isSetField(42351);
  }

  public void set(quickfix.field.LegSpecialDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.LegSpecialDividendsIndicator get(quickfix.field.LegSpecialDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSpecialDividendsIndicator getLegSpecialDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegSpecialDividendsIndicator());
  }

  public boolean isSet(quickfix.field.LegSpecialDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegSpecialDividendsIndicator() {
    return isSetField(42352);
  }

  public void set(quickfix.field.LegMaterialDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.LegMaterialDividendsIndicator get(quickfix.field.LegMaterialDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMaterialDividendsIndicator getLegMaterialDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegMaterialDividendsIndicator());
  }

  public boolean isSet(quickfix.field.LegMaterialDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegMaterialDividendsIndicator() {
    return isSetField(42353);
  }

  public void set(quickfix.field.LegOptionsExchangeDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.LegOptionsExchangeDividendsIndicator get(quickfix.field.LegOptionsExchangeDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegOptionsExchangeDividendsIndicator getLegOptionsExchangeDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegOptionsExchangeDividendsIndicator());
  }

  public boolean isSet(quickfix.field.LegOptionsExchangeDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegOptionsExchangeDividendsIndicator() {
    return isSetField(42354);
  }

  public void set(quickfix.field.LegAdditionalDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalDividendsIndicator get(quickfix.field.LegAdditionalDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalDividendsIndicator getLegAdditionalDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalDividendsIndicator());
  }

  public boolean isSet(quickfix.field.LegAdditionalDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalDividendsIndicator() {
    return isSetField(42355);
  }

  public void set(quickfix.field.LegAllDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.LegAllDividendsIndicator get(quickfix.field.LegAllDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAllDividendsIndicator getLegAllDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegAllDividendsIndicator());
  }

  public boolean isSet(quickfix.field.LegAllDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegAllDividendsIndicator() {
    return isSetField(42356);
  }
}
