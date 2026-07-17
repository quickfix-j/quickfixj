/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DeliveryStream extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41058, 41059, 41060, 41061, 41062, 42192, 42193, 41063, 41064, 41065, 41066, 41067, 41218, 41068, 41069, 41070, 41071, 41072, 41073, 41074, 41075, 41076, 41077, 41078, 41079, 41080, 43094, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DeliveryStream() {
    super();
  }

  public void set(quickfix.field.DeliveryStreamType value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamType get(quickfix.field.DeliveryStreamType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamType getDeliveryStreamType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamType());
  }

  public boolean isSet(quickfix.field.DeliveryStreamType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamType() {
    return isSetField(41058);
  }

  public void set(quickfix.fixlatest.component.DeliveryStreamCommoditySourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryStreamCommoditySourceGrp get(quickfix.fixlatest.component.DeliveryStreamCommoditySourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryStreamCommoditySourceGrp getDeliveryStreamCommoditySourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryStreamCommoditySourceGrp());
  }

  public void set(quickfix.field.NoDeliveryStreamCommoditySources value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryStreamCommoditySources get(quickfix.field.NoDeliveryStreamCommoditySources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryStreamCommoditySources getNoDeliveryStreamCommoditySources() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryStreamCommoditySources());
  }

  public boolean isSet(quickfix.field.NoDeliveryStreamCommoditySources field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryStreamCommoditySources() {
    return isSetField(41085);
  }

public static class NoDeliveryStreamCommoditySources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41086, 0};

  public NoDeliveryStreamCommoditySources() {
    super(41085, 41086, ORDER);
  }

  public void set(quickfix.field.DeliveryStreamCommoditySource value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamCommoditySource get(quickfix.field.DeliveryStreamCommoditySource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamCommoditySource getDeliveryStreamCommoditySource() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamCommoditySource());
  }

  public boolean isSet(quickfix.field.DeliveryStreamCommoditySource field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamCommoditySource() {
    return isSetField(41086);
  }
}

  public void set(quickfix.field.DeliveryStreamPipeline value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamPipeline get(quickfix.field.DeliveryStreamPipeline value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamPipeline getDeliveryStreamPipeline() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamPipeline());
  }

  public boolean isSet(quickfix.field.DeliveryStreamPipeline field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamPipeline() {
    return isSetField(41059);
  }

  public void set(quickfix.field.DeliveryStreamEntryPoint value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamEntryPoint get(quickfix.field.DeliveryStreamEntryPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamEntryPoint getDeliveryStreamEntryPoint() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamEntryPoint());
  }

  public boolean isSet(quickfix.field.DeliveryStreamEntryPoint field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamEntryPoint() {
    return isSetField(41060);
  }

  public void set(quickfix.field.DeliveryStreamWithdrawalPoint value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamWithdrawalPoint get(quickfix.field.DeliveryStreamWithdrawalPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamWithdrawalPoint getDeliveryStreamWithdrawalPoint() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamWithdrawalPoint());
  }

  public boolean isSet(quickfix.field.DeliveryStreamWithdrawalPoint field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamWithdrawalPoint() {
    return isSetField(41061);
  }

  public void set(quickfix.field.DeliveryStreamDeliveryPoint value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamDeliveryPoint get(quickfix.field.DeliveryStreamDeliveryPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamDeliveryPoint getDeliveryStreamDeliveryPoint() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamDeliveryPoint());
  }

  public boolean isSet(quickfix.field.DeliveryStreamDeliveryPoint field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamDeliveryPoint() {
    return isSetField(41062);
  }

  public void set(quickfix.field.DeliveryStreamDeliveryPointSource value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamDeliveryPointSource get(quickfix.field.DeliveryStreamDeliveryPointSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamDeliveryPointSource getDeliveryStreamDeliveryPointSource() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamDeliveryPointSource());
  }

  public boolean isSet(quickfix.field.DeliveryStreamDeliveryPointSource field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamDeliveryPointSource() {
    return isSetField(42192);
  }

  public void set(quickfix.field.DeliveryStreamDeliveryPointDesc value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamDeliveryPointDesc get(quickfix.field.DeliveryStreamDeliveryPointDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamDeliveryPointDesc getDeliveryStreamDeliveryPointDesc() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamDeliveryPointDesc());
  }

  public boolean isSet(quickfix.field.DeliveryStreamDeliveryPointDesc field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamDeliveryPointDesc() {
    return isSetField(42193);
  }

  public void set(quickfix.field.DeliveryStreamDeliveryRestriction value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamDeliveryRestriction get(quickfix.field.DeliveryStreamDeliveryRestriction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamDeliveryRestriction getDeliveryStreamDeliveryRestriction() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamDeliveryRestriction());
  }

  public boolean isSet(quickfix.field.DeliveryStreamDeliveryRestriction field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamDeliveryRestriction() {
    return isSetField(41063);
  }

  public void set(quickfix.field.DeliveryStreamDeliveryContingency value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamDeliveryContingency get(quickfix.field.DeliveryStreamDeliveryContingency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamDeliveryContingency getDeliveryStreamDeliveryContingency() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamDeliveryContingency());
  }

  public boolean isSet(quickfix.field.DeliveryStreamDeliveryContingency field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamDeliveryContingency() {
    return isSetField(41064);
  }

  public void set(quickfix.field.DeliveryStreamDeliveryContingentPartySide value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamDeliveryContingentPartySide get(quickfix.field.DeliveryStreamDeliveryContingentPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamDeliveryContingentPartySide getDeliveryStreamDeliveryContingentPartySide() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamDeliveryContingentPartySide());
  }

  public boolean isSet(quickfix.field.DeliveryStreamDeliveryContingentPartySide field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamDeliveryContingentPartySide() {
    return isSetField(41065);
  }

  public void set(quickfix.field.DeliveryStreamDeliverAtSourceIndicator value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamDeliverAtSourceIndicator get(quickfix.field.DeliveryStreamDeliverAtSourceIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamDeliverAtSourceIndicator getDeliveryStreamDeliverAtSourceIndicator() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamDeliverAtSourceIndicator());
  }

  public boolean isSet(quickfix.field.DeliveryStreamDeliverAtSourceIndicator field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamDeliverAtSourceIndicator() {
    return isSetField(41066);
  }

  public void set(quickfix.field.DeliveryStreamRiskApportionment value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamRiskApportionment get(quickfix.field.DeliveryStreamRiskApportionment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamRiskApportionment getDeliveryStreamRiskApportionment() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamRiskApportionment());
  }

  public boolean isSet(quickfix.field.DeliveryStreamRiskApportionment field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamRiskApportionment() {
    return isSetField(41067);
  }

  public void set(quickfix.field.DeliveryStreamRiskApportionmentSource value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamRiskApportionmentSource get(quickfix.field.DeliveryStreamRiskApportionmentSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamRiskApportionmentSource getDeliveryStreamRiskApportionmentSource() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamRiskApportionmentSource());
  }

  public boolean isSet(quickfix.field.DeliveryStreamRiskApportionmentSource field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamRiskApportionmentSource() {
    return isSetField(41218);
  }

  public void set(quickfix.fixlatest.component.DeliveryStreamCycleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DeliveryStreamCycleGrp get(quickfix.fixlatest.component.DeliveryStreamCycleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DeliveryStreamCycleGrp getDeliveryStreamCycleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DeliveryStreamCycleGrp());
  }

  public void set(quickfix.field.NoDeliveryStreamCycles value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryStreamCycles get(quickfix.field.NoDeliveryStreamCycles value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryStreamCycles getNoDeliveryStreamCycles() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryStreamCycles());
  }

  public boolean isSet(quickfix.field.NoDeliveryStreamCycles field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryStreamCycles() {
    return isSetField(41081);
  }

public static class NoDeliveryStreamCycles extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41082, 41083, 41084, 0};

  public NoDeliveryStreamCycles() {
    super(41081, 41082, ORDER);
  }

  public void set(quickfix.field.DeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamCycleDesc get(quickfix.field.DeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamCycleDesc getDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.DeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamCycleDesc() {
    return isSetField(41082);
  }

  public void set(quickfix.field.EncodedDeliveryStreamCycleDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedDeliveryStreamCycleDescLen get(quickfix.field.EncodedDeliveryStreamCycleDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedDeliveryStreamCycleDescLen getEncodedDeliveryStreamCycleDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedDeliveryStreamCycleDescLen());
  }

  public boolean isSet(quickfix.field.EncodedDeliveryStreamCycleDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedDeliveryStreamCycleDescLen() {
    return isSetField(41083);
  }

  public void set(quickfix.field.EncodedDeliveryStreamCycleDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedDeliveryStreamCycleDesc get(quickfix.field.EncodedDeliveryStreamCycleDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedDeliveryStreamCycleDesc getEncodedDeliveryStreamCycleDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedDeliveryStreamCycleDesc());
  }

  public boolean isSet(quickfix.field.EncodedDeliveryStreamCycleDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedDeliveryStreamCycleDesc() {
    return isSetField(41084);
  }
}

  public void set(quickfix.field.DeliveryStreamTitleTransferLocation value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamTitleTransferLocation get(quickfix.field.DeliveryStreamTitleTransferLocation value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamTitleTransferLocation getDeliveryStreamTitleTransferLocation() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamTitleTransferLocation());
  }

  public boolean isSet(quickfix.field.DeliveryStreamTitleTransferLocation field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamTitleTransferLocation() {
    return isSetField(41068);
  }

  public void set(quickfix.field.DeliveryStreamTitleTransferCondition value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamTitleTransferCondition get(quickfix.field.DeliveryStreamTitleTransferCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamTitleTransferCondition getDeliveryStreamTitleTransferCondition() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamTitleTransferCondition());
  }

  public boolean isSet(quickfix.field.DeliveryStreamTitleTransferCondition field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamTitleTransferCondition() {
    return isSetField(41069);
  }

  public void set(quickfix.field.DeliveryStreamImporterOfRecord value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamImporterOfRecord get(quickfix.field.DeliveryStreamImporterOfRecord value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamImporterOfRecord getDeliveryStreamImporterOfRecord() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamImporterOfRecord());
  }

  public boolean isSet(quickfix.field.DeliveryStreamImporterOfRecord field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamImporterOfRecord() {
    return isSetField(41070);
  }

  public void set(quickfix.field.DeliveryStreamNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamNegativeTolerance get(quickfix.field.DeliveryStreamNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamNegativeTolerance getDeliveryStreamNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamNegativeTolerance());
  }

  public boolean isSet(quickfix.field.DeliveryStreamNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamNegativeTolerance() {
    return isSetField(41071);
  }

  public void set(quickfix.field.DeliveryStreamPositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamPositiveTolerance get(quickfix.field.DeliveryStreamPositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamPositiveTolerance getDeliveryStreamPositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamPositiveTolerance());
  }

  public boolean isSet(quickfix.field.DeliveryStreamPositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamPositiveTolerance() {
    return isSetField(41072);
  }

  public void set(quickfix.field.DeliveryStreamToleranceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamToleranceUnitOfMeasure get(quickfix.field.DeliveryStreamToleranceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamToleranceUnitOfMeasure getDeliveryStreamToleranceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamToleranceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.DeliveryStreamToleranceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamToleranceUnitOfMeasure() {
    return isSetField(41073);
  }

  public void set(quickfix.field.DeliveryStreamToleranceType value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamToleranceType get(quickfix.field.DeliveryStreamToleranceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamToleranceType getDeliveryStreamToleranceType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamToleranceType());
  }

  public boolean isSet(quickfix.field.DeliveryStreamToleranceType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamToleranceType() {
    return isSetField(41074);
  }

  public void set(quickfix.field.DeliveryStreamToleranceOptionSide value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamToleranceOptionSide get(quickfix.field.DeliveryStreamToleranceOptionSide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamToleranceOptionSide getDeliveryStreamToleranceOptionSide() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamToleranceOptionSide());
  }

  public boolean isSet(quickfix.field.DeliveryStreamToleranceOptionSide field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamToleranceOptionSide() {
    return isSetField(41075);
  }

  public void set(quickfix.field.DeliveryStreamTotalPositiveTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamTotalPositiveTolerance get(quickfix.field.DeliveryStreamTotalPositiveTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamTotalPositiveTolerance getDeliveryStreamTotalPositiveTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamTotalPositiveTolerance());
  }

  public boolean isSet(quickfix.field.DeliveryStreamTotalPositiveTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamTotalPositiveTolerance() {
    return isSetField(41076);
  }

  public void set(quickfix.field.DeliveryStreamTotalNegativeTolerance value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamTotalNegativeTolerance get(quickfix.field.DeliveryStreamTotalNegativeTolerance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamTotalNegativeTolerance getDeliveryStreamTotalNegativeTolerance() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamTotalNegativeTolerance());
  }

  public boolean isSet(quickfix.field.DeliveryStreamTotalNegativeTolerance field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamTotalNegativeTolerance() {
    return isSetField(41077);
  }

  public void set(quickfix.field.DeliveryStreamNotionalConversionFactor value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamNotionalConversionFactor get(quickfix.field.DeliveryStreamNotionalConversionFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamNotionalConversionFactor getDeliveryStreamNotionalConversionFactor() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamNotionalConversionFactor());
  }

  public boolean isSet(quickfix.field.DeliveryStreamNotionalConversionFactor field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamNotionalConversionFactor() {
    return isSetField(41078);
  }

  public void set(quickfix.field.DeliveryStreamTransportEquipment value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamTransportEquipment get(quickfix.field.DeliveryStreamTransportEquipment value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamTransportEquipment getDeliveryStreamTransportEquipment() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamTransportEquipment());
  }

  public boolean isSet(quickfix.field.DeliveryStreamTransportEquipment field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamTransportEquipment() {
    return isSetField(41079);
  }

  public void set(quickfix.field.DeliveryStreamElectingPartySide value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamElectingPartySide get(quickfix.field.DeliveryStreamElectingPartySide value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamElectingPartySide getDeliveryStreamElectingPartySide() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamElectingPartySide());
  }

  public boolean isSet(quickfix.field.DeliveryStreamElectingPartySide field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamElectingPartySide() {
    return isSetField(41080);
  }

  public void set(quickfix.field.DeliveryStreamRouteOrCharter value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamRouteOrCharter get(quickfix.field.DeliveryStreamRouteOrCharter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamRouteOrCharter getDeliveryStreamRouteOrCharter() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamRouteOrCharter());
  }

  public boolean isSet(quickfix.field.DeliveryStreamRouteOrCharter field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamRouteOrCharter() {
    return isSetField(43094);
  }
}
