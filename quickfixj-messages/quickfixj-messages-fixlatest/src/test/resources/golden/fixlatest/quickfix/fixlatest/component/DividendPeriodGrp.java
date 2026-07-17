/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DividendPeriodGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42274, };
  protected int[] getGroupFields() { return componentGroups; }

  public DividendPeriodGrp() {
    super();
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
