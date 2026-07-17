/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDividendPeriodGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42862, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDividendPeriodGrp() {
    super();
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
