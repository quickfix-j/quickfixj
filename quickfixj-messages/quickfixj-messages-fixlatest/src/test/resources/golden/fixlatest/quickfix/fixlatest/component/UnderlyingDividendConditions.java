/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDividendConditions extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42826, 42827, 42828, 42829, 42830, 42831, 42832, 42833, 42834, 42835, 42836, 42837, 42838, 42839, 42840, 42841, 42842, 42843, 42844, 42845, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDividendConditions() {
    super();
  }

  public void set(quickfix.field.UnderlyingDividendReinvestmentIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendReinvestmentIndicator get(quickfix.field.UnderlyingDividendReinvestmentIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendReinvestmentIndicator getUnderlyingDividendReinvestmentIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendReinvestmentIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendReinvestmentIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendReinvestmentIndicator() {
    return isSetField(42826);
  }

  public void set(quickfix.field.UnderlyingDividendEntitlementEvent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendEntitlementEvent get(quickfix.field.UnderlyingDividendEntitlementEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendEntitlementEvent getUnderlyingDividendEntitlementEvent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendEntitlementEvent());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendEntitlementEvent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendEntitlementEvent() {
    return isSetField(42827);
  }

  public void set(quickfix.field.UnderlyingDividendAmountType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAmountType get(quickfix.field.UnderlyingDividendAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAmountType getUnderlyingDividendAmountType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAmountType());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAmountType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAmountType() {
    return isSetField(42828);
  }

  public void set(quickfix.field.UnderlyingDividendUnderlierRefID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendUnderlierRefID get(quickfix.field.UnderlyingDividendUnderlierRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendUnderlierRefID getUnderlyingDividendUnderlierRefID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendUnderlierRefID());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendUnderlierRefID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendUnderlierRefID() {
    return isSetField(42829);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDividendPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDividendPeriodGrp get(quickfix.fixlatest.component.UnderlyingDividendPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDividendPeriodGrp getUnderlyingDividendPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDividendPeriodGrp());
  }

  public void set(quickfix.field.NoUnderlyingDividendPeriods value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDividendPeriods get(quickfix.field.NoUnderlyingDividendPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDividendPeriods getNoUnderlyingDividendPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDividendPeriods());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDividendPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDividendPeriods() {
    return isSetField(42862);
  }

public static class NoUnderlyingDividendPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42863, 42864, 42865, 42866, 42867, 42868, 42882, 42869, 42870, 42871, 42872, 42873, 42874, 42875, 42876, 42877, 42878, 42879, 42880, 42881, 0};

  public NoUnderlyingDividendPeriods() {
    super(42862, 42863, ORDER);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodSequence value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodSequence get(quickfix.field.UnderlyingDividendPeriodSequence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodSequence getUnderlyingDividendPeriodSequence() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodSequence());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodSequence field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodSequence() {
    return isSetField(42863);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodStartDateUnadjusted get(quickfix.field.UnderlyingDividendPeriodStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodStartDateUnadjusted getUnderlyingDividendPeriodStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodStartDateUnadjusted() {
    return isSetField(42864);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodEndDateUnadjusted get(quickfix.field.UnderlyingDividendPeriodEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodEndDateUnadjusted getUnderlyingDividendPeriodEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodEndDateUnadjusted() {
    return isSetField(42865);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodUnderlierRefID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodUnderlierRefID get(quickfix.field.UnderlyingDividendPeriodUnderlierRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodUnderlierRefID getUnderlyingDividendPeriodUnderlierRefID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodUnderlierRefID());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodUnderlierRefID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodUnderlierRefID() {
    return isSetField(42866);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodStrikePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodStrikePrice get(quickfix.field.UnderlyingDividendPeriodStrikePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodStrikePrice getUnderlyingDividendPeriodStrikePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodStrikePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodStrikePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodStrikePrice() {
    return isSetField(42867);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodBusinessDayConvention get(quickfix.field.UnderlyingDividendPeriodBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodBusinessDayConvention getUnderlyingDividendPeriodBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodBusinessDayConvention() {
    return isSetField(42868);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDividendPeriodBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDividendPeriodBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingDividendPeriodBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDividendPeriodBusinessCenterGrp getUnderlyingDividendPeriodBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDividendPeriodBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingDividendPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDividendPeriodBusinessCenters get(quickfix.field.NoUnderlyingDividendPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDividendPeriodBusinessCenters getNoUnderlyingDividendPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDividendPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDividendPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDividendPeriodBusinessCenters() {
    return isSetField(42882);
  }

public static class NoUnderlyingDividendPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42883, 0};

  public NoUnderlyingDividendPeriodBusinessCenters() {
    super(42882, 42883, ORDER);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodBusinessCenter get(quickfix.field.UnderlyingDividendPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodBusinessCenter getUnderlyingDividendPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodBusinessCenter() {
    return isSetField(42883);
  }
}

  public void set(quickfix.field.UnderlyingDividendPeriodValuationDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateUnadjusted get(quickfix.field.UnderlyingDividendPeriodValuationDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateUnadjusted getUnderlyingDividendPeriodValuationDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodValuationDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodValuationDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodValuationDateUnadjusted() {
    return isSetField(42869);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateRelativeTo get(quickfix.field.UnderlyingDividendPeriodValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateRelativeTo getUnderlyingDividendPeriodValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodValuationDateRelativeTo() {
    return isSetField(42870);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateOffsetPeriod get(quickfix.field.UnderlyingDividendPeriodValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateOffsetPeriod getUnderlyingDividendPeriodValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodValuationDateOffsetPeriod() {
    return isSetField(42871);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateOffsetUnit get(quickfix.field.UnderlyingDividendPeriodValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateOffsetUnit getUnderlyingDividendPeriodValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodValuationDateOffsetUnit() {
    return isSetField(42872);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateOffsetDayType get(quickfix.field.UnderlyingDividendPeriodValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateOffsetDayType getUnderlyingDividendPeriodValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodValuationDateOffsetDayType() {
    return isSetField(42873);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodValuationDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateAdjusted get(quickfix.field.UnderlyingDividendPeriodValuationDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodValuationDateAdjusted getUnderlyingDividendPeriodValuationDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodValuationDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodValuationDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodValuationDateAdjusted() {
    return isSetField(42874);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodPaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateUnadjusted get(quickfix.field.UnderlyingDividendPeriodPaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateUnadjusted getUnderlyingDividendPeriodPaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodPaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodPaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodPaymentDateUnadjusted() {
    return isSetField(42875);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodPaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateRelativeTo get(quickfix.field.UnderlyingDividendPeriodPaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateRelativeTo getUnderlyingDividendPeriodPaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodPaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodPaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodPaymentDateRelativeTo() {
    return isSetField(42876);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetPeriod get(quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetPeriod getUnderlyingDividendPeriodPaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodPaymentDateOffsetPeriod() {
    return isSetField(42877);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetUnit get(quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetUnit getUnderlyingDividendPeriodPaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodPaymentDateOffsetUnit() {
    return isSetField(42878);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetDayType get(quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetDayType getUnderlyingDividendPeriodPaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodPaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodPaymentDateOffsetDayType() {
    return isSetField(42879);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodPaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateAdjusted get(quickfix.field.UnderlyingDividendPeriodPaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodPaymentDateAdjusted getUnderlyingDividendPeriodPaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodPaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodPaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodPaymentDateAdjusted() {
    return isSetField(42880);
  }

  public void set(quickfix.field.UnderlyingDividendPeriodXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendPeriodXID get(quickfix.field.UnderlyingDividendPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendPeriodXID getUnderlyingDividendPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendPeriodXID());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendPeriodXID() {
    return isSetField(42881);
  }
}

  public void set(quickfix.field.UnderlyingExtraordinaryDividendPartySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryDividendPartySide get(quickfix.field.UnderlyingExtraordinaryDividendPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryDividendPartySide getUnderlyingExtraordinaryDividendPartySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryDividendPartySide());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryDividendPartySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryDividendPartySide() {
    return isSetField(42830);
  }

  public void set(quickfix.field.UnderlyingExtraordinaryDividendAmountType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryDividendAmountType get(quickfix.field.UnderlyingExtraordinaryDividendAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryDividendAmountType getUnderlyingExtraordinaryDividendAmountType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryDividendAmountType());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryDividendAmountType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryDividendAmountType() {
    return isSetField(42831);
  }

  public void set(quickfix.field.UnderlyingExtraordinaryDividendCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryDividendCurrency get(quickfix.field.UnderlyingExtraordinaryDividendCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryDividendCurrency getUnderlyingExtraordinaryDividendCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryDividendCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryDividendCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryDividendCurrency() {
    return isSetField(42832);
  }

  public void set(quickfix.field.UnderlyingExtraordinaryDividendDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingExtraordinaryDividendDeterminationMethod get(quickfix.field.UnderlyingExtraordinaryDividendDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingExtraordinaryDividendDeterminationMethod getUnderlyingExtraordinaryDividendDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingExtraordinaryDividendDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingExtraordinaryDividendDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingExtraordinaryDividendDeterminationMethod() {
    return isSetField(42833);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDividendFXTriggerDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDividendFXTriggerDate get(quickfix.fixlatest.component.UnderlyingDividendFXTriggerDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDividendFXTriggerDate getUnderlyingDividendFXTriggerDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDividendFXTriggerDate());
  }

  public void set(quickfix.fixlatest.component.UnderlyingDividendAccrualFloatingRate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDividendAccrualFloatingRate get(quickfix.fixlatest.component.UnderlyingDividendAccrualFloatingRate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDividendAccrualFloatingRate getUnderlyingDividendAccrualFloatingRateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDividendAccrualFloatingRate());
  }

  public void set(quickfix.field.UnderlyingDividendAccrualFixedRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendAccrualFixedRate get(quickfix.field.UnderlyingDividendAccrualFixedRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendAccrualFixedRate getUnderlyingDividendAccrualFixedRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendAccrualFixedRate());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendAccrualFixedRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendAccrualFixedRate() {
    return isSetField(42834);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDate get(quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDate getUnderlyingDividendAccrualPaymentDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDividendAccrualPaymentDate());
  }

  public void set(quickfix.field.UnderlyingDividendCompoundingMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendCompoundingMethod get(quickfix.field.UnderlyingDividendCompoundingMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendCompoundingMethod getUnderlyingDividendCompoundingMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendCompoundingMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendCompoundingMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendCompoundingMethod() {
    return isSetField(42835);
  }

  public void set(quickfix.field.UnderlyingDividendNumOfIndexUnits value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendNumOfIndexUnits get(quickfix.field.UnderlyingDividendNumOfIndexUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendNumOfIndexUnits getUnderlyingDividendNumOfIndexUnits() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendNumOfIndexUnits());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendNumOfIndexUnits field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendNumOfIndexUnits() {
    return isSetField(42836);
  }

  public void set(quickfix.field.UnderlyingDividendCashPercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendCashPercentage get(quickfix.field.UnderlyingDividendCashPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendCashPercentage getUnderlyingDividendCashPercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendCashPercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendCashPercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendCashPercentage() {
    return isSetField(42837);
  }

  public void set(quickfix.field.UnderlyingDividendCashEquivalentPercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendCashEquivalentPercentage get(quickfix.field.UnderlyingDividendCashEquivalentPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendCashEquivalentPercentage getUnderlyingDividendCashEquivalentPercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendCashEquivalentPercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendCashEquivalentPercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendCashEquivalentPercentage() {
    return isSetField(42838);
  }

  public void set(quickfix.field.UnderlyingNonCashDividendTreatment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingNonCashDividendTreatment get(quickfix.field.UnderlyingNonCashDividendTreatment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingNonCashDividendTreatment getUnderlyingNonCashDividendTreatment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingNonCashDividendTreatment());
  }

  public boolean isSet(quickfix.field.UnderlyingNonCashDividendTreatment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingNonCashDividendTreatment() {
    return isSetField(42839);
  }

  public void set(quickfix.field.UnderlyingDividendComposition value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendComposition get(quickfix.field.UnderlyingDividendComposition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendComposition getUnderlyingDividendComposition() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendComposition());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendComposition field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendComposition() {
    return isSetField(42840);
  }

  public void set(quickfix.field.UnderlyingSpecialDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSpecialDividendsIndicator get(quickfix.field.UnderlyingSpecialDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSpecialDividendsIndicator getUnderlyingSpecialDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSpecialDividendsIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingSpecialDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSpecialDividendsIndicator() {
    return isSetField(42841);
  }

  public void set(quickfix.field.UnderlyingMaterialDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMaterialDividendsIndicator get(quickfix.field.UnderlyingMaterialDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMaterialDividendsIndicator getUnderlyingMaterialDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMaterialDividendsIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingMaterialDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMaterialDividendsIndicator() {
    return isSetField(42842);
  }

  public void set(quickfix.field.UnderlyingOptionsExchangeDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingOptionsExchangeDividendsIndicator get(quickfix.field.UnderlyingOptionsExchangeDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingOptionsExchangeDividendsIndicator getUnderlyingOptionsExchangeDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingOptionsExchangeDividendsIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingOptionsExchangeDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingOptionsExchangeDividendsIndicator() {
    return isSetField(42843);
  }

  public void set(quickfix.field.UnderlyingAdditionalDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalDividendsIndicator get(quickfix.field.UnderlyingAdditionalDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalDividendsIndicator getUnderlyingAdditionalDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalDividendsIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalDividendsIndicator() {
    return isSetField(42844);
  }

  public void set(quickfix.field.UnderlyingAllDividendsIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAllDividendsIndicator get(quickfix.field.UnderlyingAllDividendsIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAllDividendsIndicator getUnderlyingAllDividendsIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAllDividendsIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingAllDividendsIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAllDividendsIndicator() {
    return isSetField(42845);
  }
}
