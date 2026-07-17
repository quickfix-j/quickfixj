/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDeliveryStream extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41429, 41430, 41431, 41432, 41433, 42194, 42195, 41434, 41435, 41436, 41437, 41438, 41219, 41439, 41440, 41441, 41442, 41443, 41444, 41445, 41446, 41447, 41448, 41449, 41450, 41451, 43095, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegDeliveryStream() {
    super();
  }

  public void set(quickfix.field.LegDeliveryStreamType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamType get(quickfix.field.LegDeliveryStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamType getLegDeliveryStreamType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamType());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamType() {
    return isSetField(41429);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryStreamCommoditySourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryStreamCommoditySourceGrp get(quickfix.fixlatest.component.LegDeliveryStreamCommoditySourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryStreamCommoditySourceGrp getLegDeliveryStreamCommoditySourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryStreamCommoditySourceGrp());
  }

  public void set(quickfix.field.NoLegDeliveryStreamCommoditySources value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryStreamCommoditySources get(quickfix.field.NoLegDeliveryStreamCommoditySources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryStreamCommoditySources getNoLegDeliveryStreamCommoditySources() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryStreamCommoditySources());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryStreamCommoditySources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryStreamCommoditySources() {
    return isSetField(41460);
  }

public static class NoLegDeliveryStreamCommoditySources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41461, 0};

  public NoLegDeliveryStreamCommoditySources() {
    super(41460, 41461, ORDER);
  }

  public void set(quickfix.field.LegDeliveryStreamCommoditySource value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamCommoditySource get(quickfix.field.LegDeliveryStreamCommoditySource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamCommoditySource getLegDeliveryStreamCommoditySource() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamCommoditySource());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamCommoditySource field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamCommoditySource() {
    return isSetField(41461);
  }
}

  public void set(quickfix.field.LegDeliveryStreamPipeline value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamPipeline get(quickfix.field.LegDeliveryStreamPipeline value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamPipeline getLegDeliveryStreamPipeline() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamPipeline());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamPipeline field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamPipeline() {
    return isSetField(41430);
  }

  public void set(quickfix.field.LegDeliveryStreamEntryPoint value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamEntryPoint get(quickfix.field.LegDeliveryStreamEntryPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamEntryPoint getLegDeliveryStreamEntryPoint() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamEntryPoint());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamEntryPoint field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamEntryPoint() {
    return isSetField(41431);
  }

  public void set(quickfix.field.LegDeliveryStreamWithdrawalPoint value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamWithdrawalPoint get(quickfix.field.LegDeliveryStreamWithdrawalPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamWithdrawalPoint getLegDeliveryStreamWithdrawalPoint() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamWithdrawalPoint());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamWithdrawalPoint field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamWithdrawalPoint() {
    return isSetField(41432);
  }

  public void set(quickfix.field.LegDeliveryStreamDeliveryPoint value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamDeliveryPoint get(quickfix.field.LegDeliveryStreamDeliveryPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamDeliveryPoint getLegDeliveryStreamDeliveryPoint() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamDeliveryPoint());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamDeliveryPoint field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamDeliveryPoint() {
    return isSetField(41433);
  }

  public void set(quickfix.field.LegDeliveryStreamDeliveryPointSource value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamDeliveryPointSource get(quickfix.field.LegDeliveryStreamDeliveryPointSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamDeliveryPointSource getLegDeliveryStreamDeliveryPointSource() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamDeliveryPointSource());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamDeliveryPointSource field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamDeliveryPointSource() {
    return isSetField(42194);
  }

  public void set(quickfix.field.LegDeliveryStreamDeliveryPointDesc value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamDeliveryPointDesc get(quickfix.field.LegDeliveryStreamDeliveryPointDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamDeliveryPointDesc getLegDeliveryStreamDeliveryPointDesc() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamDeliveryPointDesc());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamDeliveryPointDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamDeliveryPointDesc() {
    return isSetField(42195);
  }

  public void set(quickfix.field.LegDeliveryStreamDeliveryRestriction value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamDeliveryRestriction get(quickfix.field.LegDeliveryStreamDeliveryRestriction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamDeliveryRestriction getLegDeliveryStreamDeliveryRestriction() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamDeliveryRestriction());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamDeliveryRestriction field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamDeliveryRestriction() {
    return isSetField(41434);
  }

  public void set(quickfix.field.LegDeliveryStreamDeliveryContingency value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamDeliveryContingency get(quickfix.field.LegDeliveryStreamDeliveryContingency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamDeliveryContingency getLegDeliveryStreamDeliveryContingency() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamDeliveryContingency());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamDeliveryContingency field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamDeliveryContingency() {
    return isSetField(41435);
  }

  public void set(quickfix.field.LegDeliveryStreamDeliveryContingentPartySide value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamDeliveryContingentPartySide get(quickfix.field.LegDeliveryStreamDeliveryContingentPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamDeliveryContingentPartySide getLegDeliveryStreamDeliveryContingentPartySide() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamDeliveryContingentPartySide());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamDeliveryContingentPartySide field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamDeliveryContingentPartySide() {
    return isSetField(41436);
  }

  public void set(quickfix.field.LegDeliveryStreamDeliverAtSourceIndicator value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamDeliverAtSourceIndicator get(quickfix.field.LegDeliveryStreamDeliverAtSourceIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamDeliverAtSourceIndicator getLegDeliveryStreamDeliverAtSourceIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamDeliverAtSourceIndicator());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamDeliverAtSourceIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamDeliverAtSourceIndicator() {
    return isSetField(41437);
  }

  public void set(quickfix.field.LegDeliveryStreamRiskApportionment value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamRiskApportionment get(quickfix.field.LegDeliveryStreamRiskApportionment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamRiskApportionment getLegDeliveryStreamRiskApportionment() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamRiskApportionment());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamRiskApportionment field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamRiskApportionment() {
    return isSetField(41438);
  }

  public void set(quickfix.field.LegDeliveryStreamRiskApportionmentSource value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamRiskApportionmentSource get(quickfix.field.LegDeliveryStreamRiskApportionmentSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamRiskApportionmentSource getLegDeliveryStreamRiskApportionmentSource() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamRiskApportionmentSource());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamRiskApportionmentSource field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamRiskApportionmentSource() {
    return isSetField(41219);
  }

  public void set(quickfix.fixlatest.component.LegDeliveryStreamCycleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegDeliveryStreamCycleGrp get(quickfix.fixlatest.component.LegDeliveryStreamCycleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegDeliveryStreamCycleGrp getLegDeliveryStreamCycleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegDeliveryStreamCycleGrp());
  }

  public void set(quickfix.field.NoLegDeliveryStreamCycles value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryStreamCycles get(quickfix.field.NoLegDeliveryStreamCycles value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryStreamCycles getNoLegDeliveryStreamCycles() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryStreamCycles());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryStreamCycles field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryStreamCycles() {
    return isSetField(41456);
  }

public static class NoLegDeliveryStreamCycles extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41457, 41458, 41459, 0};

  public NoLegDeliveryStreamCycles() {
    super(41456, 41457, ORDER);
  }

  public void set(quickfix.field.LegDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamCycleDesc get(quickfix.field.LegDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamCycleDesc getLegDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamCycleDesc() {
    return isSetField(41457);
  }

  public void set(quickfix.field.EncodedLegDeliveryStreamCycleDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDescLen get(quickfix.field.EncodedLegDeliveryStreamCycleDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDescLen getEncodedLegDeliveryStreamCycleDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegDeliveryStreamCycleDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegDeliveryStreamCycleDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegDeliveryStreamCycleDescLen() {
    return isSetField(41458);
  }

  public void set(quickfix.field.EncodedLegDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDesc get(quickfix.field.EncodedLegDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegDeliveryStreamCycleDesc getEncodedLegDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegDeliveryStreamCycleDesc() {
    return isSetField(41459);
  }
}

  public void set(quickfix.field.LegDeliveryStreamTitleTransferLocation value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamTitleTransferLocation get(quickfix.field.LegDeliveryStreamTitleTransferLocation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamTitleTransferLocation getLegDeliveryStreamTitleTransferLocation() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamTitleTransferLocation());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamTitleTransferLocation field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamTitleTransferLocation() {
    return isSetField(41439);
  }

  public void set(quickfix.field.LegDeliveryStreamTitleTransferCondition value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamTitleTransferCondition get(quickfix.field.LegDeliveryStreamTitleTransferCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamTitleTransferCondition getLegDeliveryStreamTitleTransferCondition() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamTitleTransferCondition());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamTitleTransferCondition field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamTitleTransferCondition() {
    return isSetField(41440);
  }

  public void set(quickfix.field.LegDeliveryStreamImporterOfRecord value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamImporterOfRecord get(quickfix.field.LegDeliveryStreamImporterOfRecord value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamImporterOfRecord getLegDeliveryStreamImporterOfRecord() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamImporterOfRecord());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamImporterOfRecord field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamImporterOfRecord() {
    return isSetField(41441);
  }

  public void set(quickfix.field.LegDeliveryStreamNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamNegativeTolerance get(quickfix.field.LegDeliveryStreamNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamNegativeTolerance getLegDeliveryStreamNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamNegativeTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamNegativeTolerance() {
    return isSetField(41442);
  }

  public void set(quickfix.field.LegDeliveryStreamPositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamPositiveTolerance get(quickfix.field.LegDeliveryStreamPositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamPositiveTolerance getLegDeliveryStreamPositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamPositiveTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamPositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamPositiveTolerance() {
    return isSetField(41443);
  }

  public void set(quickfix.field.LegDeliveryStreamToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamToleranceUnitOfMeasure get(quickfix.field.LegDeliveryStreamToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamToleranceUnitOfMeasure getLegDeliveryStreamToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamToleranceUnitOfMeasure() {
    return isSetField(41444);
  }

  public void set(quickfix.field.LegDeliveryStreamToleranceType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamToleranceType get(quickfix.field.LegDeliveryStreamToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamToleranceType getLegDeliveryStreamToleranceType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamToleranceType());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamToleranceType() {
    return isSetField(41445);
  }

  public void set(quickfix.field.LegDeliveryStreamToleranceOptionSide value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamToleranceOptionSide get(quickfix.field.LegDeliveryStreamToleranceOptionSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamToleranceOptionSide getLegDeliveryStreamToleranceOptionSide() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamToleranceOptionSide());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamToleranceOptionSide field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamToleranceOptionSide() {
    return isSetField(41446);
  }

  public void set(quickfix.field.LegDeliveryStreamTotalPositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamTotalPositiveTolerance get(quickfix.field.LegDeliveryStreamTotalPositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamTotalPositiveTolerance getLegDeliveryStreamTotalPositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamTotalPositiveTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamTotalPositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamTotalPositiveTolerance() {
    return isSetField(41447);
  }

  public void set(quickfix.field.LegDeliveryStreamTotalNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamTotalNegativeTolerance get(quickfix.field.LegDeliveryStreamTotalNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamTotalNegativeTolerance getLegDeliveryStreamTotalNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamTotalNegativeTolerance());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamTotalNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamTotalNegativeTolerance() {
    return isSetField(41448);
  }

  public void set(quickfix.field.LegDeliveryStreamNotionalConversionFactor value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamNotionalConversionFactor get(quickfix.field.LegDeliveryStreamNotionalConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamNotionalConversionFactor getLegDeliveryStreamNotionalConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamNotionalConversionFactor());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamNotionalConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamNotionalConversionFactor() {
    return isSetField(41449);
  }

  public void set(quickfix.field.LegDeliveryStreamTransportEquipment value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamTransportEquipment get(quickfix.field.LegDeliveryStreamTransportEquipment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamTransportEquipment getLegDeliveryStreamTransportEquipment() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamTransportEquipment());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamTransportEquipment field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamTransportEquipment() {
    return isSetField(41450);
  }

  public void set(quickfix.field.LegDeliveryStreamElectingPartySide value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamElectingPartySide get(quickfix.field.LegDeliveryStreamElectingPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamElectingPartySide getLegDeliveryStreamElectingPartySide() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamElectingPartySide());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamElectingPartySide field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamElectingPartySide() {
    return isSetField(41451);
  }

  public void set(quickfix.field.LegDeliveryStreamRouteOrCharter value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamRouteOrCharter get(quickfix.field.LegDeliveryStreamRouteOrCharter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamRouteOrCharter getLegDeliveryStreamRouteOrCharter() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamRouteOrCharter());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamRouteOrCharter field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamRouteOrCharter() {
    return isSetField(43095);
  }
}
