/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDeliveryStream extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41777, 41778, 41779, 41780, 41781, 42196, 42197, 41782, 41783, 41784, 41785, 41786, 41587, 41787, 41788, 41789, 41790, 41791, 41792, 41793, 41794, 41795, 41796, 41797, 41798, 41799, 43096, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDeliveryStream() {
    super();
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamType get(quickfix.field.UnderlyingDeliveryStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamType getUnderlyingDeliveryStreamType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamType() {
    return isSetField(41777);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryStreamCommoditySourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStreamCommoditySourceGrp get(quickfix.fixlatest.component.UnderlyingDeliveryStreamCommoditySourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStreamCommoditySourceGrp getUnderlyingDeliveryStreamCommoditySourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryStreamCommoditySourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliveryStreamCommoditySources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryStreamCommoditySources get(quickfix.field.NoUnderlyingDeliveryStreamCommoditySources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryStreamCommoditySources getNoUnderlyingDeliveryStreamCommoditySources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryStreamCommoditySources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryStreamCommoditySources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryStreamCommoditySources() {
    return isSetField(41808);
  }

public static class NoUnderlyingDeliveryStreamCommoditySources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41809, 0};

  public NoUnderlyingDeliveryStreamCommoditySources() {
    super(41808, 41809, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamCommoditySource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamCommoditySource get(quickfix.field.UnderlyingDeliveryStreamCommoditySource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamCommoditySource getUnderlyingDeliveryStreamCommoditySource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamCommoditySource());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamCommoditySource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamCommoditySource() {
    return isSetField(41809);
  }
}

  public void set(quickfix.field.UnderlyingDeliveryStreamPipeline value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamPipeline get(quickfix.field.UnderlyingDeliveryStreamPipeline value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamPipeline getUnderlyingDeliveryStreamPipeline() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamPipeline());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamPipeline field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamPipeline() {
    return isSetField(41778);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamEntryPoint value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamEntryPoint get(quickfix.field.UnderlyingDeliveryStreamEntryPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamEntryPoint getUnderlyingDeliveryStreamEntryPoint() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamEntryPoint());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamEntryPoint field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamEntryPoint() {
    return isSetField(41779);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamWithdrawalPoint value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamWithdrawalPoint get(quickfix.field.UnderlyingDeliveryStreamWithdrawalPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamWithdrawalPoint getUnderlyingDeliveryStreamWithdrawalPoint() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamWithdrawalPoint());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamWithdrawalPoint field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamWithdrawalPoint() {
    return isSetField(41780);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamDeliveryPoint value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryPoint get(quickfix.field.UnderlyingDeliveryStreamDeliveryPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryPoint getUnderlyingDeliveryStreamDeliveryPoint() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamDeliveryPoint());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamDeliveryPoint field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamDeliveryPoint() {
    return isSetField(41781);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamDeliveryPointSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryPointSource get(quickfix.field.UnderlyingDeliveryStreamDeliveryPointSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryPointSource getUnderlyingDeliveryStreamDeliveryPointSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamDeliveryPointSource());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamDeliveryPointSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamDeliveryPointSource() {
    return isSetField(42196);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamDeliveryPointDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryPointDesc get(quickfix.field.UnderlyingDeliveryStreamDeliveryPointDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryPointDesc getUnderlyingDeliveryStreamDeliveryPointDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamDeliveryPointDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamDeliveryPointDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamDeliveryPointDesc() {
    return isSetField(42197);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamDeliveryRestriction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryRestriction get(quickfix.field.UnderlyingDeliveryStreamDeliveryRestriction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryRestriction getUnderlyingDeliveryStreamDeliveryRestriction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamDeliveryRestriction());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamDeliveryRestriction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamDeliveryRestriction() {
    return isSetField(41782);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamDeliveryContingency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryContingency get(quickfix.field.UnderlyingDeliveryStreamDeliveryContingency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryContingency getUnderlyingDeliveryStreamDeliveryContingency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamDeliveryContingency());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamDeliveryContingency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamDeliveryContingency() {
    return isSetField(41783);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamDeliveryContingentPartySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryContingentPartySide get(quickfix.field.UnderlyingDeliveryStreamDeliveryContingentPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliveryContingentPartySide getUnderlyingDeliveryStreamDeliveryContingentPartySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamDeliveryContingentPartySide());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamDeliveryContingentPartySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamDeliveryContingentPartySide() {
    return isSetField(41784);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamDeliverAtSourceIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliverAtSourceIndicator get(quickfix.field.UnderlyingDeliveryStreamDeliverAtSourceIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamDeliverAtSourceIndicator getUnderlyingDeliveryStreamDeliverAtSourceIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamDeliverAtSourceIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamDeliverAtSourceIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamDeliverAtSourceIndicator() {
    return isSetField(41785);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamRiskApportionment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamRiskApportionment get(quickfix.field.UnderlyingDeliveryStreamRiskApportionment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamRiskApportionment getUnderlyingDeliveryStreamRiskApportionment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamRiskApportionment());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamRiskApportionment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamRiskApportionment() {
    return isSetField(41786);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamRiskApportionmentSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamRiskApportionmentSource get(quickfix.field.UnderlyingDeliveryStreamRiskApportionmentSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamRiskApportionmentSource getUnderlyingDeliveryStreamRiskApportionmentSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamRiskApportionmentSource());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamRiskApportionmentSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamRiskApportionmentSource() {
    return isSetField(41587);
  }

  public void set(quickfix.fixlatest.component.UnderlyingDeliveryStreamCycleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStreamCycleGrp get(quickfix.fixlatest.component.UnderlyingDeliveryStreamCycleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingDeliveryStreamCycleGrp getUnderlyingDeliveryStreamCycleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingDeliveryStreamCycleGrp());
  }

  public void set(quickfix.field.NoUnderlyingDeliveryStreamCycles value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryStreamCycles get(quickfix.field.NoUnderlyingDeliveryStreamCycles value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryStreamCycles getNoUnderlyingDeliveryStreamCycles() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryStreamCycles());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryStreamCycles field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryStreamCycles() {
    return isSetField(41804);
  }

public static class NoUnderlyingDeliveryStreamCycles extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41805, 41806, 41807, 0};

  public NoUnderlyingDeliveryStreamCycles() {
    super(41804, 41805, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamCycleDesc get(quickfix.field.UnderlyingDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamCycleDesc getUnderlyingDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamCycleDesc() {
    return isSetField(41805);
  }

  public void set(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen get(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen getEncodedUnderlyingDeliveryStreamCycleDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingDeliveryStreamCycleDescLen() {
    return isSetField(41806);
  }

  public void set(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc get(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc getEncodedUnderlyingDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingDeliveryStreamCycleDesc() {
    return isSetField(41807);
  }
}

  public void set(quickfix.field.UnderlyingDeliveryStreamTitleTransferLocation value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamTitleTransferLocation get(quickfix.field.UnderlyingDeliveryStreamTitleTransferLocation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamTitleTransferLocation getUnderlyingDeliveryStreamTitleTransferLocation() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamTitleTransferLocation());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamTitleTransferLocation field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamTitleTransferLocation() {
    return isSetField(41787);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamTitleTransferCondition value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamTitleTransferCondition get(quickfix.field.UnderlyingDeliveryStreamTitleTransferCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamTitleTransferCondition getUnderlyingDeliveryStreamTitleTransferCondition() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamTitleTransferCondition());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamTitleTransferCondition field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamTitleTransferCondition() {
    return isSetField(41788);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamImporterOfRecord value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamImporterOfRecord get(quickfix.field.UnderlyingDeliveryStreamImporterOfRecord value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamImporterOfRecord getUnderlyingDeliveryStreamImporterOfRecord() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamImporterOfRecord());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamImporterOfRecord field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamImporterOfRecord() {
    return isSetField(41789);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamNegativeTolerance get(quickfix.field.UnderlyingDeliveryStreamNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamNegativeTolerance getUnderlyingDeliveryStreamNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamNegativeTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamNegativeTolerance() {
    return isSetField(41790);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamPositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamPositiveTolerance get(quickfix.field.UnderlyingDeliveryStreamPositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamPositiveTolerance getUnderlyingDeliveryStreamPositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamPositiveTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamPositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamPositiveTolerance() {
    return isSetField(41791);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamToleranceUnitOfMeasure get(quickfix.field.UnderlyingDeliveryStreamToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamToleranceUnitOfMeasure getUnderlyingDeliveryStreamToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamToleranceUnitOfMeasure() {
    return isSetField(41792);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamToleranceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamToleranceType get(quickfix.field.UnderlyingDeliveryStreamToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamToleranceType getUnderlyingDeliveryStreamToleranceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamToleranceType());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamToleranceType() {
    return isSetField(41793);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamToleranceOptionSide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamToleranceOptionSide get(quickfix.field.UnderlyingDeliveryStreamToleranceOptionSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamToleranceOptionSide getUnderlyingDeliveryStreamToleranceOptionSide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamToleranceOptionSide());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamToleranceOptionSide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamToleranceOptionSide() {
    return isSetField(41794);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamTotalPositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamTotalPositiveTolerance get(quickfix.field.UnderlyingDeliveryStreamTotalPositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamTotalPositiveTolerance getUnderlyingDeliveryStreamTotalPositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamTotalPositiveTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamTotalPositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamTotalPositiveTolerance() {
    return isSetField(41795);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamTotalNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamTotalNegativeTolerance get(quickfix.field.UnderlyingDeliveryStreamTotalNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamTotalNegativeTolerance getUnderlyingDeliveryStreamTotalNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamTotalNegativeTolerance());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamTotalNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamTotalNegativeTolerance() {
    return isSetField(41796);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamNotionalConversionFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamNotionalConversionFactor get(quickfix.field.UnderlyingDeliveryStreamNotionalConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamNotionalConversionFactor getUnderlyingDeliveryStreamNotionalConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamNotionalConversionFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamNotionalConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamNotionalConversionFactor() {
    return isSetField(41797);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamTransportEquipment value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamTransportEquipment get(quickfix.field.UnderlyingDeliveryStreamTransportEquipment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamTransportEquipment getUnderlyingDeliveryStreamTransportEquipment() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamTransportEquipment());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamTransportEquipment field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamTransportEquipment() {
    return isSetField(41798);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamElectingPartySide value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamElectingPartySide get(quickfix.field.UnderlyingDeliveryStreamElectingPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamElectingPartySide getUnderlyingDeliveryStreamElectingPartySide() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamElectingPartySide());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamElectingPartySide field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamElectingPartySide() {
    return isSetField(41799);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamRouteOrCharter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamRouteOrCharter get(quickfix.field.UnderlyingDeliveryStreamRouteOrCharter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamRouteOrCharter getUnderlyingDeliveryStreamRouteOrCharter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamRouteOrCharter());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamRouteOrCharter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamRouteOrCharter() {
    return isSetField(43096);
  }
}
