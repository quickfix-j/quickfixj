/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCommodity extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41648, 41649, 41650, 41651, 41652, 41653, 41654, 42588, 41655, 41656, 41657, 41658, 41659, 41660, 41661, 41662, 41663, 41664, 41665, 41666, 41667, 41668, 41669, 41670, 41671, 41672, 41673, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCommodity() {
    super();
  }

  public void set(quickfix.field.LegStreamCommodityBase value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityBase get(quickfix.field.LegStreamCommodityBase value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityBase getLegStreamCommodityBase() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityBase());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityBase field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityBase() {
    return isSetField(41648);
  }

  public void set(quickfix.field.LegStreamCommodityType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityType get(quickfix.field.LegStreamCommodityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityType getLegStreamCommodityType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityType());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityType() {
    return isSetField(41649);
  }

  public void set(quickfix.field.LegStreamCommoditySecurityID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySecurityID get(quickfix.field.LegStreamCommoditySecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySecurityID getLegStreamCommoditySecurityID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySecurityID());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySecurityID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySecurityID() {
    return isSetField(41650);
  }

  public void set(quickfix.field.LegStreamCommoditySecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySecurityIDSource get(quickfix.field.LegStreamCommoditySecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySecurityIDSource getLegStreamCommoditySecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySecurityIDSource());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySecurityIDSource() {
    return isSetField(41651);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommodityAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommodityAltIDGrp get(quickfix.fixlatest.component.LegStreamCommodityAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommodityAltIDGrp getLegStreamCommodityAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommodityAltIDGrp());
  }

  public void set(quickfix.field.NoLegStreamCommodityAltIDs value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommodityAltIDs get(quickfix.field.NoLegStreamCommodityAltIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommodityAltIDs getNoLegStreamCommodityAltIDs() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommodityAltIDs());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommodityAltIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommodityAltIDs() {
    return isSetField(41674);
  }

public static class NoLegStreamCommodityAltIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41675, 41676, 0};

  public NoLegStreamCommodityAltIDs() {
    super(41674, 41675, ORDER);
  }

  public void set(quickfix.field.LegStreamCommodityAltID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityAltID get(quickfix.field.LegStreamCommodityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityAltID getLegStreamCommodityAltID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityAltID());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityAltID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityAltID() {
    return isSetField(41675);
  }

  public void set(quickfix.field.LegStreamCommodityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityAltIDSource get(quickfix.field.LegStreamCommodityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityAltIDSource getLegStreamCommodityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityAltIDSource());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityAltIDSource() {
    return isSetField(41676);
  }
}

  public void set(quickfix.field.LegStreamCommodityDesc value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityDesc get(quickfix.field.LegStreamCommodityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityDesc getLegStreamCommodityDesc() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityDesc());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityDesc() {
    return isSetField(41652);
  }

  public void set(quickfix.field.EncodedLegStreamCommodityDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegStreamCommodityDescLen get(quickfix.field.EncodedLegStreamCommodityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegStreamCommodityDescLen getEncodedLegStreamCommodityDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegStreamCommodityDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegStreamCommodityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegStreamCommodityDescLen() {
    return isSetField(41653);
  }

  public void set(quickfix.field.EncodedLegStreamCommodityDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegStreamCommodityDesc get(quickfix.field.EncodedLegStreamCommodityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegStreamCommodityDesc getEncodedLegStreamCommodityDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegStreamCommodityDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegStreamCommodityDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegStreamCommodityDesc() {
    return isSetField(41654);
  }

  public void set(quickfix.field.LegStreamCommodityDeliveryPricingRegion value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityDeliveryPricingRegion get(quickfix.field.LegStreamCommodityDeliveryPricingRegion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityDeliveryPricingRegion getLegStreamCommodityDeliveryPricingRegion() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityDeliveryPricingRegion());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityDeliveryPricingRegion field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityDeliveryPricingRegion() {
    return isSetField(42588);
  }

  public void set(quickfix.fixlatest.component.LegStreamAssetAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamAssetAttributeGrp get(quickfix.fixlatest.component.LegStreamAssetAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamAssetAttributeGrp getLegStreamAssetAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamAssetAttributeGrp());
  }

  public void set(quickfix.field.NoLegStreamAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamAssetAttributes get(quickfix.field.NoLegStreamAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamAssetAttributes getNoLegStreamAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoLegStreamAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamAssetAttributes() {
    return isSetField(41452);
  }

public static class NoLegStreamAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41453, 41454, 41455, 0};

  public NoLegStreamAssetAttributes() {
    super(41452, 41453, ORDER);
  }

  public void set(quickfix.field.LegStreamAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.LegStreamAssetAttributeType get(quickfix.field.LegStreamAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamAssetAttributeType getLegStreamAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamAssetAttributeType());
  }

  public boolean isSet(quickfix.field.LegStreamAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamAssetAttributeType() {
    return isSetField(41453);
  }

  public void set(quickfix.field.LegStreamAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.LegStreamAssetAttributeValue get(quickfix.field.LegStreamAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamAssetAttributeValue getLegStreamAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.LegStreamAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.LegStreamAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamAssetAttributeValue() {
    return isSetField(41454);
  }

  public void set(quickfix.field.LegStreamAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.LegStreamAssetAttributeLimit get(quickfix.field.LegStreamAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamAssetAttributeLimit getLegStreamAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.LegStreamAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamAssetAttributeLimit() {
    return isSetField(41455);
  }
}

  public void set(quickfix.field.LegStreamCommodityUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityUnitOfMeasure get(quickfix.field.LegStreamCommodityUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityUnitOfMeasure getLegStreamCommodityUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityUnitOfMeasure() {
    return isSetField(41655);
  }

  public void set(quickfix.field.LegStreamCommodityCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityCurrency get(quickfix.field.LegStreamCommodityCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityCurrency getLegStreamCommodityCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityCurrency());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityCurrency() {
    return isSetField(41656);
  }

  public void set(quickfix.field.LegStreamCommodityExchange value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityExchange get(quickfix.field.LegStreamCommodityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityExchange getLegStreamCommodityExchange() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityExchange());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityExchange field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityExchange() {
    return isSetField(41657);
  }

  public void set(quickfix.field.LegStreamCommodityRateSource value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityRateSource get(quickfix.field.LegStreamCommodityRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityRateSource getLegStreamCommodityRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityRateSource());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityRateSource() {
    return isSetField(41658);
  }

  public void set(quickfix.field.LegStreamCommodityRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityRateReferencePage get(quickfix.field.LegStreamCommodityRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityRateReferencePage getLegStreamCommodityRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityRateReferencePage());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityRateReferencePage() {
    return isSetField(41659);
  }

  public void set(quickfix.field.LegStreamCommodityRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityRateReferencePageHeading get(quickfix.field.LegStreamCommodityRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityRateReferencePageHeading getLegStreamCommodityRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityRateReferencePageHeading() {
    return isSetField(41660);
  }

  public void set(quickfix.field.LegStreamDataProvider value) {
    setField(value);
  }

  public quickfix.field.LegStreamDataProvider get(quickfix.field.LegStreamDataProvider value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamDataProvider getLegStreamDataProvider() throws FieldNotFound {
    return get(new quickfix.field.LegStreamDataProvider());
  }

  public boolean isSet(quickfix.field.LegStreamDataProvider field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamDataProvider() {
    return isSetField(41661);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommodityDataSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommodityDataSourceGrp get(quickfix.fixlatest.component.LegStreamCommodityDataSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommodityDataSourceGrp getLegStreamCommodityDataSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommodityDataSourceGrp());
  }

  public void set(quickfix.field.NoLegStreamCommodityDataSources value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommodityDataSources get(quickfix.field.NoLegStreamCommodityDataSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommodityDataSources getNoLegStreamCommodityDataSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommodityDataSources());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommodityDataSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommodityDataSources() {
    return isSetField(41677);
  }

public static class NoLegStreamCommodityDataSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41678, 41679, 0};

  public NoLegStreamCommodityDataSources() {
    super(41677, 41678, ORDER);
  }

  public void set(quickfix.field.LegStreamCommodityDataSourceID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityDataSourceID get(quickfix.field.LegStreamCommodityDataSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityDataSourceID getLegStreamCommodityDataSourceID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityDataSourceID());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityDataSourceID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityDataSourceID() {
    return isSetField(41678);
  }

  public void set(quickfix.field.LegStreamCommodityDataSourceIDType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityDataSourceIDType get(quickfix.field.LegStreamCommodityDataSourceIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityDataSourceIDType getLegStreamCommodityDataSourceIDType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityDataSourceIDType());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityDataSourceIDType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityDataSourceIDType() {
    return isSetField(41679);
  }
}

  public void set(quickfix.field.LegStreamCommodityPricingType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityPricingType get(quickfix.field.LegStreamCommodityPricingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityPricingType getLegStreamCommodityPricingType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityPricingType());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityPricingType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityPricingType() {
    return isSetField(41662);
  }

  public void set(quickfix.field.LegStreamCommodityNearbySettlDayPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityNearbySettlDayPeriod get(quickfix.field.LegStreamCommodityNearbySettlDayPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityNearbySettlDayPeriod getLegStreamCommodityNearbySettlDayPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityNearbySettlDayPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityNearbySettlDayPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityNearbySettlDayPeriod() {
    return isSetField(41663);
  }

  public void set(quickfix.field.LegStreamCommodityNearbySettlDayUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityNearbySettlDayUnit get(quickfix.field.LegStreamCommodityNearbySettlDayUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityNearbySettlDayUnit getLegStreamCommodityNearbySettlDayUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityNearbySettlDayUnit());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityNearbySettlDayUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityNearbySettlDayUnit() {
    return isSetField(41664);
  }

  public void set(quickfix.field.LegStreamCommoditySettlDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDateUnadjusted get(quickfix.field.LegStreamCommoditySettlDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDateUnadjusted getLegStreamCommoditySettlDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDateUnadjusted() {
    return isSetField(41665);
  }

  public void set(quickfix.field.LegStreamCommoditySettlDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDateBusinessDayConvention get(quickfix.field.LegStreamCommoditySettlDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDateBusinessDayConvention getLegStreamCommoditySettlDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDateBusinessDayConvention() {
    return isSetField(41666);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlBusinessCenterGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlBusinessCenterGrp getLegStreamCommoditySettlBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlBusinessCenters get(quickfix.field.NoLegStreamCommoditySettlBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlBusinessCenters getNoLegStreamCommoditySettlBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlBusinessCenters() {
    return isSetField(41646);
  }

public static class NoLegStreamCommoditySettlBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41647, 0};

  public NoLegStreamCommoditySettlBusinessCenters() {
    super(41646, 41647, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlBusinessCenter get(quickfix.field.LegStreamCommoditySettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlBusinessCenter getLegStreamCommoditySettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlBusinessCenter() {
    return isSetField(41647);
  }
}

  public void set(quickfix.field.LegStreamCommoditySettlDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDateAdjusted get(quickfix.field.LegStreamCommoditySettlDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDateAdjusted getLegStreamCommoditySettlDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDateAdjusted() {
    return isSetField(41667);
  }

  public void set(quickfix.field.LegStreamCommoditySettlMonth value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlMonth get(quickfix.field.LegStreamCommoditySettlMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlMonth getLegStreamCommoditySettlMonth() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlMonth());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlMonth field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlMonth() {
    return isSetField(41668);
  }

  public void set(quickfix.field.LegStreamCommoditySettlDateRollPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDateRollPeriod get(quickfix.field.LegStreamCommoditySettlDateRollPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDateRollPeriod getLegStreamCommoditySettlDateRollPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDateRollPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDateRollPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDateRollPeriod() {
    return isSetField(41669);
  }

  public void set(quickfix.field.LegStreamCommoditySettlDateRollUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDateRollUnit get(quickfix.field.LegStreamCommoditySettlDateRollUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDateRollUnit getLegStreamCommoditySettlDateRollUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDateRollUnit());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDateRollUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDateRollUnit() {
    return isSetField(41670);
  }

  public void set(quickfix.field.LegStreamCommoditySettlDayType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDayType get(quickfix.field.LegStreamCommoditySettlDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDayType getLegStreamCommoditySettlDayType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDayType());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDayType() {
    return isSetField(41671);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlPeriodGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlPeriodGrp getLegStreamCommoditySettlPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlPeriodGrp());
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlPeriods value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlPeriods get(quickfix.field.NoLegStreamCommoditySettlPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlPeriods getNoLegStreamCommoditySettlPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlPeriods());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlPeriods() {
    return isSetField(41686);
  }

public static class NoLegStreamCommoditySettlPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41687, 41688, 41689, 41690, 41691, 41692, 41693, 41694, 41695, 41696, 41697, 41680, 41698, 41699, 0};

  public NoLegStreamCommoditySettlPeriods() {
    super(41686, 41687, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlCountry value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlCountry get(quickfix.field.LegStreamCommoditySettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlCountry getLegStreamCommoditySettlCountry() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlCountry());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlCountry() {
    return isSetField(41687);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTimeZone get(quickfix.field.LegStreamCommoditySettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTimeZone getLegStreamCommoditySettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTimeZone());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTimeZone() {
    return isSetField(41688);
  }

  public void set(quickfix.field.LegStreamCommoditySettlFlowType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlFlowType get(quickfix.field.LegStreamCommoditySettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlFlowType getLegStreamCommoditySettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlFlowType());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlFlowType() {
    return isSetField(41689);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodNotional value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotional get(quickfix.field.LegStreamCommoditySettlPeriodNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotional getLegStreamCommoditySettlPeriodNotional() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodNotional());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodNotional() {
    return isSetField(41690);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure get(quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure getLegStreamCommoditySettlPeriodNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodNotionalUnitOfMeasure() {
    return isSetField(41691);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod get(quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod getLegStreamCommoditySettlPeriodFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodFrequencyPeriod() {
    return isSetField(41692);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit get(quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit getLegStreamCommoditySettlPeriodFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodFrequencyUnit() {
    return isSetField(41693);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPrice get(quickfix.field.LegStreamCommoditySettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPrice getLegStreamCommoditySettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodPrice() {
    return isSetField(41694);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure get(quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure getLegStreamCommoditySettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodPriceUnitOfMeasure() {
    return isSetField(41695);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency get(quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency getLegStreamCommoditySettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodPriceCurrency() {
    return isSetField(41696);
  }

  public void set(quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction get(quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction getLegStreamCommoditySettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlHolidaysProcessingInstruction() {
    return isSetField(41697);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp getLegStreamCommoditySettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlDayGrp());
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlDays get(quickfix.field.NoLegStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlDays getNoLegStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlDays() {
    return isSetField(41680);
  }

public static class NoLegStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41681, 41682, 41683, 0};

  public NoLegStreamCommoditySettlDays() {
    super(41680, 41681, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlDay get(quickfix.field.LegStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlDay getLegStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlDay() {
    return isSetField(41681);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours get(quickfix.field.LegStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTotalHours getLegStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTotalHours() {
    return isSetField(41682);
  }

  public void set(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp getLegStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegStreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlTimes get(quickfix.field.NoLegStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlTimes getNoLegStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlTimes() {
    return isSetField(41683);
  }

public static class NoLegStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41684, 41685, 41935, 0};

  public NoLegStreamCommoditySettlTimes() {
    super(41683, 41684, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlStart get(quickfix.field.LegStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlStart getLegStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlStart() {
    return isSetField(41684);
  }

  public void set(quickfix.field.LegStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlEnd get(quickfix.field.LegStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlEnd getLegStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlEnd() {
    return isSetField(41685);
  }

  public void set(quickfix.field.LegStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlTimeType get(quickfix.field.LegStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlTimeType getLegStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlTimeType() {
    return isSetField(41935);
  }
}
}

  public void set(quickfix.field.LegStreamCommoditySettlPeriodXID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXID get(quickfix.field.LegStreamCommoditySettlPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXID getLegStreamCommoditySettlPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodXID());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodXID() {
    return isSetField(41698);
  }

  public void set(quickfix.field.LegStreamCommoditySettlPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXIDRef get(quickfix.field.LegStreamCommoditySettlPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlPeriodXIDRef getLegStreamCommoditySettlPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlPeriodXIDRef() {
    return isSetField(41699);
  }
}

  public void set(quickfix.field.LegStreamCommodityXID value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityXID get(quickfix.field.LegStreamCommodityXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityXID getLegStreamCommodityXID() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityXID());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityXID field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityXID() {
    return isSetField(41672);
  }

  public void set(quickfix.field.LegStreamCommodityXIDRef value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommodityXIDRef get(quickfix.field.LegStreamCommodityXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommodityXIDRef getLegStreamCommodityXIDRef() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommodityXIDRef());
  }

  public boolean isSet(quickfix.field.LegStreamCommodityXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommodityXIDRef() {
    return isSetField(41673);
  }
}
