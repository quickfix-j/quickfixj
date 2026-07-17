/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamCommodity extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41251, 41252, 41253, 41254, 41255, 41256, 41257, 42587, 41258, 41259, 41260, 41261, 41262, 41263, 41264, 41265, 41266, 41267, 41268, 41269, 41270, 41271, 41272, 41273, 41274, 41275, 41276, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public StreamCommodity() {
    super();
  }

  public void set(quickfix.field.StreamCommodityBase value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityBase get(quickfix.field.StreamCommodityBase value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityBase getStreamCommodityBase() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityBase());
  }

  public boolean isSet(quickfix.field.StreamCommodityBase field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityBase() {
    return isSetField(41251);
  }

  public void set(quickfix.field.StreamCommodityType value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityType get(quickfix.field.StreamCommodityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityType getStreamCommodityType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityType());
  }

  public boolean isSet(quickfix.field.StreamCommodityType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityType() {
    return isSetField(41252);
  }

  public void set(quickfix.field.StreamCommoditySecurityID value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySecurityID get(quickfix.field.StreamCommoditySecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySecurityID getStreamCommoditySecurityID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySecurityID());
  }

  public boolean isSet(quickfix.field.StreamCommoditySecurityID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySecurityID() {
    return isSetField(41253);
  }

  public void set(quickfix.field.StreamCommoditySecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySecurityIDSource get(quickfix.field.StreamCommoditySecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySecurityIDSource getStreamCommoditySecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySecurityIDSource());
  }

  public boolean isSet(quickfix.field.StreamCommoditySecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySecurityIDSource() {
    return isSetField(41254);
  }

  public void set(quickfix.fixlatest.component.StreamCommodityAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommodityAltIDGrp get(quickfix.fixlatest.component.StreamCommodityAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommodityAltIDGrp getStreamCommodityAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommodityAltIDGrp());
  }

  public void set(quickfix.field.NoStreamCommodityAltIDs value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommodityAltIDs get(quickfix.field.NoStreamCommodityAltIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommodityAltIDs getNoStreamCommodityAltIDs() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommodityAltIDs());
  }

  public boolean isSet(quickfix.field.NoStreamCommodityAltIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommodityAltIDs() {
    return isSetField(41277);
  }

public static class NoStreamCommodityAltIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41278, 41279, 0};

  public NoStreamCommodityAltIDs() {
    super(41277, 41278, ORDER);
  }

  public void set(quickfix.field.StreamCommodityAltID value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityAltID get(quickfix.field.StreamCommodityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityAltID getStreamCommodityAltID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityAltID());
  }

  public boolean isSet(quickfix.field.StreamCommodityAltID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityAltID() {
    return isSetField(41278);
  }

  public void set(quickfix.field.StreamCommodityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityAltIDSource get(quickfix.field.StreamCommodityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityAltIDSource getStreamCommodityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityAltIDSource());
  }

  public boolean isSet(quickfix.field.StreamCommodityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityAltIDSource() {
    return isSetField(41279);
  }
}

  public void set(quickfix.field.StreamCommodityDesc value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityDesc get(quickfix.field.StreamCommodityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityDesc getStreamCommodityDesc() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityDesc());
  }

  public boolean isSet(quickfix.field.StreamCommodityDesc field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityDesc() {
    return isSetField(41255);
  }

  public void set(quickfix.field.EncodedStreamCommodityDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedStreamCommodityDescLen get(quickfix.field.EncodedStreamCommodityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedStreamCommodityDescLen getEncodedStreamCommodityDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedStreamCommodityDescLen());
  }

  public boolean isSet(quickfix.field.EncodedStreamCommodityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedStreamCommodityDescLen() {
    return isSetField(41256);
  }

  public void set(quickfix.field.EncodedStreamCommodityDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedStreamCommodityDesc get(quickfix.field.EncodedStreamCommodityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedStreamCommodityDesc getEncodedStreamCommodityDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedStreamCommodityDesc());
  }

  public boolean isSet(quickfix.field.EncodedStreamCommodityDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedStreamCommodityDesc() {
    return isSetField(41257);
  }

  public void set(quickfix.field.StreamCommodityDeliveryPricingRegion value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityDeliveryPricingRegion get(quickfix.field.StreamCommodityDeliveryPricingRegion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityDeliveryPricingRegion getStreamCommodityDeliveryPricingRegion() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityDeliveryPricingRegion());
  }

  public boolean isSet(quickfix.field.StreamCommodityDeliveryPricingRegion field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityDeliveryPricingRegion() {
    return isSetField(42587);
  }

  public void set(quickfix.fixlatest.component.StreamAssetAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamAssetAttributeGrp get(quickfix.fixlatest.component.StreamAssetAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamAssetAttributeGrp getStreamAssetAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamAssetAttributeGrp());
  }

  public void set(quickfix.field.NoStreamAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoStreamAssetAttributes get(quickfix.field.NoStreamAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamAssetAttributes getNoStreamAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoStreamAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoStreamAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamAssetAttributes() {
    return isSetField(41237);
  }

public static class NoStreamAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41238, 41239, 41240, 0};

  public NoStreamAssetAttributes() {
    super(41237, 41238, ORDER);
  }

  public void set(quickfix.field.StreamAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.StreamAssetAttributeType get(quickfix.field.StreamAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAssetAttributeType getStreamAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.StreamAssetAttributeType());
  }

  public boolean isSet(quickfix.field.StreamAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetStreamAssetAttributeType() {
    return isSetField(41238);
  }

  public void set(quickfix.field.StreamAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.StreamAssetAttributeValue get(quickfix.field.StreamAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAssetAttributeValue getStreamAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.StreamAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.StreamAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetStreamAssetAttributeValue() {
    return isSetField(41239);
  }

  public void set(quickfix.field.StreamAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.StreamAssetAttributeLimit get(quickfix.field.StreamAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamAssetAttributeLimit getStreamAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.StreamAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.StreamAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetStreamAssetAttributeLimit() {
    return isSetField(41240);
  }
}

  public void set(quickfix.field.StreamCommodityUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityUnitOfMeasure get(quickfix.field.StreamCommodityUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityUnitOfMeasure getStreamCommodityUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamCommodityUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityUnitOfMeasure() {
    return isSetField(41258);
  }

  public void set(quickfix.field.StreamCommodityCurrency value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityCurrency get(quickfix.field.StreamCommodityCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityCurrency getStreamCommodityCurrency() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityCurrency());
  }

  public boolean isSet(quickfix.field.StreamCommodityCurrency field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityCurrency() {
    return isSetField(41259);
  }

  public void set(quickfix.field.StreamCommodityExchange value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityExchange get(quickfix.field.StreamCommodityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityExchange getStreamCommodityExchange() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityExchange());
  }

  public boolean isSet(quickfix.field.StreamCommodityExchange field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityExchange() {
    return isSetField(41260);
  }

  public void set(quickfix.field.StreamCommodityRateSource value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityRateSource get(quickfix.field.StreamCommodityRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityRateSource getStreamCommodityRateSource() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityRateSource());
  }

  public boolean isSet(quickfix.field.StreamCommodityRateSource field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityRateSource() {
    return isSetField(41261);
  }

  public void set(quickfix.field.StreamCommodityRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityRateReferencePage get(quickfix.field.StreamCommodityRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityRateReferencePage getStreamCommodityRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityRateReferencePage());
  }

  public boolean isSet(quickfix.field.StreamCommodityRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityRateReferencePage() {
    return isSetField(41262);
  }

  public void set(quickfix.field.StreamCommodityRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityRateReferencePageHeading get(quickfix.field.StreamCommodityRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityRateReferencePageHeading getStreamCommodityRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.StreamCommodityRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityRateReferencePageHeading() {
    return isSetField(41263);
  }

  public void set(quickfix.field.StreamDataProvider value) {
    setField(value);
  }

  public quickfix.field.StreamDataProvider get(quickfix.field.StreamDataProvider value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamDataProvider getStreamDataProvider() throws FieldNotFound {
    return get(new quickfix.field.StreamDataProvider());
  }

  public boolean isSet(quickfix.field.StreamDataProvider field) {
    return isSetField(field);
  }

  public boolean isSetStreamDataProvider() {
    return isSetField(41264);
  }

  public void set(quickfix.fixlatest.component.StreamCommodityDataSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommodityDataSourceGrp get(quickfix.fixlatest.component.StreamCommodityDataSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommodityDataSourceGrp getStreamCommodityDataSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommodityDataSourceGrp());
  }

  public void set(quickfix.field.NoStreamCommodityDataSources value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommodityDataSources get(quickfix.field.NoStreamCommodityDataSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommodityDataSources getNoStreamCommodityDataSources() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommodityDataSources());
  }

  public boolean isSet(quickfix.field.NoStreamCommodityDataSources field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommodityDataSources() {
    return isSetField(41280);
  }

public static class NoStreamCommodityDataSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41281, 41282, 0};

  public NoStreamCommodityDataSources() {
    super(41280, 41281, ORDER);
  }

  public void set(quickfix.field.StreamCommodityDataSourceID value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityDataSourceID get(quickfix.field.StreamCommodityDataSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityDataSourceID getStreamCommodityDataSourceID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityDataSourceID());
  }

  public boolean isSet(quickfix.field.StreamCommodityDataSourceID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityDataSourceID() {
    return isSetField(41281);
  }

  public void set(quickfix.field.StreamCommodityDataSourceIDType value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityDataSourceIDType get(quickfix.field.StreamCommodityDataSourceIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityDataSourceIDType getStreamCommodityDataSourceIDType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityDataSourceIDType());
  }

  public boolean isSet(quickfix.field.StreamCommodityDataSourceIDType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityDataSourceIDType() {
    return isSetField(41282);
  }
}

  public void set(quickfix.field.StreamCommodityPricingType value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityPricingType get(quickfix.field.StreamCommodityPricingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityPricingType getStreamCommodityPricingType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityPricingType());
  }

  public boolean isSet(quickfix.field.StreamCommodityPricingType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityPricingType() {
    return isSetField(41265);
  }

  public void set(quickfix.field.StreamCommodityNearbySettlDayPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityNearbySettlDayPeriod get(quickfix.field.StreamCommodityNearbySettlDayPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityNearbySettlDayPeriod getStreamCommodityNearbySettlDayPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityNearbySettlDayPeriod());
  }

  public boolean isSet(quickfix.field.StreamCommodityNearbySettlDayPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityNearbySettlDayPeriod() {
    return isSetField(41266);
  }

  public void set(quickfix.field.StreamCommodityNearbySettlDayUnit value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityNearbySettlDayUnit get(quickfix.field.StreamCommodityNearbySettlDayUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityNearbySettlDayUnit getStreamCommodityNearbySettlDayUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityNearbySettlDayUnit());
  }

  public boolean isSet(quickfix.field.StreamCommodityNearbySettlDayUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityNearbySettlDayUnit() {
    return isSetField(41267);
  }

  public void set(quickfix.field.StreamCommoditySettlDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlDateUnadjusted get(quickfix.field.StreamCommoditySettlDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlDateUnadjusted getStreamCommoditySettlDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlDateUnadjusted());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlDateUnadjusted() {
    return isSetField(41268);
  }

  public void set(quickfix.field.StreamCommoditySettlDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlDateBusinessDayConvention get(quickfix.field.StreamCommoditySettlDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlDateBusinessDayConvention getStreamCommoditySettlDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlDateBusinessDayConvention() {
    return isSetField(41269);
  }

  public void set(quickfix.fixlatest.component.StreamCommoditySettlBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommoditySettlBusinessCenterGrp get(quickfix.fixlatest.component.StreamCommoditySettlBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommoditySettlBusinessCenterGrp getStreamCommoditySettlBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommoditySettlBusinessCenterGrp());
  }

  public void set(quickfix.field.NoStreamCommoditySettlBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlBusinessCenters get(quickfix.field.NoStreamCommoditySettlBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlBusinessCenters getNoStreamCommoditySettlBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlBusinessCenters() {
    return isSetField(41249);
  }

public static class NoStreamCommoditySettlBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41250, 0};

  public NoStreamCommoditySettlBusinessCenters() {
    super(41249, 41250, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlBusinessCenter get(quickfix.field.StreamCommoditySettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlBusinessCenter getStreamCommoditySettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlBusinessCenter() {
    return isSetField(41250);
  }
}

  public void set(quickfix.field.StreamCommoditySettlDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlDateAdjusted get(quickfix.field.StreamCommoditySettlDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlDateAdjusted getStreamCommoditySettlDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlDateAdjusted());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlDateAdjusted() {
    return isSetField(41270);
  }

  public void set(quickfix.field.StreamCommoditySettlMonth value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlMonth get(quickfix.field.StreamCommoditySettlMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlMonth getStreamCommoditySettlMonth() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlMonth());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlMonth field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlMonth() {
    return isSetField(41271);
  }

  public void set(quickfix.field.StreamCommoditySettlDateRollPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlDateRollPeriod get(quickfix.field.StreamCommoditySettlDateRollPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlDateRollPeriod getStreamCommoditySettlDateRollPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlDateRollPeriod());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlDateRollPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlDateRollPeriod() {
    return isSetField(41272);
  }

  public void set(quickfix.field.StreamCommoditySettlDateRollUnit value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlDateRollUnit get(quickfix.field.StreamCommoditySettlDateRollUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlDateRollUnit getStreamCommoditySettlDateRollUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlDateRollUnit());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlDateRollUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlDateRollUnit() {
    return isSetField(41273);
  }

  public void set(quickfix.field.StreamCommoditySettlDayType value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlDayType get(quickfix.field.StreamCommoditySettlDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlDayType getStreamCommoditySettlDayType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlDayType());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlDayType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlDayType() {
    return isSetField(41274);
  }

  public void set(quickfix.fixlatest.component.StreamCommoditySettlPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommoditySettlPeriodGrp get(quickfix.fixlatest.component.StreamCommoditySettlPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommoditySettlPeriodGrp getStreamCommoditySettlPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommoditySettlPeriodGrp());
  }

  public void set(quickfix.field.NoStreamCommoditySettlPeriods value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlPeriods get(quickfix.field.NoStreamCommoditySettlPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlPeriods getNoStreamCommoditySettlPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlPeriods());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlPeriods() {
    return isSetField(41289);
  }

public static class NoStreamCommoditySettlPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41290, 41291, 41292, 41293, 41294, 41295, 41296, 41297, 41298, 41299, 41300, 41283, 41301, 41302, 0};

  public NoStreamCommoditySettlPeriods() {
    super(41289, 41290, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlCountry value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlCountry get(quickfix.field.StreamCommoditySettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlCountry getStreamCommoditySettlCountry() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlCountry());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlCountry() {
    return isSetField(41290);
  }

  public void set(quickfix.field.StreamCommoditySettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTimeZone get(quickfix.field.StreamCommoditySettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTimeZone getStreamCommoditySettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTimeZone());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTimeZone() {
    return isSetField(41291);
  }

  public void set(quickfix.field.StreamCommoditySettlFlowType value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlFlowType get(quickfix.field.StreamCommoditySettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlFlowType getStreamCommoditySettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlFlowType());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlFlowType() {
    return isSetField(41292);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodNotional value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodNotional get(quickfix.field.StreamCommoditySettlPeriodNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodNotional getStreamCommoditySettlPeriodNotional() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodNotional());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodNotional field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodNotional() {
    return isSetField(41293);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure get(quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure getStreamCommoditySettlPeriodNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodNotionalUnitOfMeasure() {
    return isSetField(41294);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod get(quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod getStreamCommoditySettlPeriodFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodFrequencyPeriod() {
    return isSetField(41295);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyUnit get(quickfix.field.StreamCommoditySettlPeriodFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodFrequencyUnit getStreamCommoditySettlPeriodFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodFrequencyUnit());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodFrequencyUnit() {
    return isSetField(41296);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodPrice get(quickfix.field.StreamCommoditySettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodPrice getStreamCommoditySettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodPrice() {
    return isSetField(41297);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure get(quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure getStreamCommoditySettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodPriceUnitOfMeasure() {
    return isSetField(41298);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceCurrency get(quickfix.field.StreamCommoditySettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodPriceCurrency getStreamCommoditySettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodPriceCurrency() {
    return isSetField(41299);
  }

  public void set(quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction get(quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction getStreamCommoditySettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlHolidaysProcessingInstruction() {
    return isSetField(41300);
  }

  public void set(quickfix.fixlatest.component.StreamCommoditySettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommoditySettlDayGrp get(quickfix.fixlatest.component.StreamCommoditySettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommoditySettlDayGrp getStreamCommoditySettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommoditySettlDayGrp());
  }

  public void set(quickfix.field.NoStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlDays get(quickfix.field.NoStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlDays getNoStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlDays() {
    return isSetField(41283);
  }

public static class NoStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41284, 41285, 41286, 0};

  public NoStreamCommoditySettlDays() {
    super(41283, 41284, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlDay get(quickfix.field.StreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlDay getStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlDay() {
    return isSetField(41284);
  }

  public void set(quickfix.field.StreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTotalHours get(quickfix.field.StreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTotalHours getStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTotalHours() {
    return isSetField(41285);
  }

  public void set(quickfix.fixlatest.component.StreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.StreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StreamCommoditySettlTimeGrp getStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlTimes get(quickfix.field.NoStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlTimes getNoStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlTimes() {
    return isSetField(41286);
  }

public static class NoStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41287, 41288, 41588, 0};

  public NoStreamCommoditySettlTimes() {
    super(41286, 41287, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlStart get(quickfix.field.StreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlStart getStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlStart() {
    return isSetField(41287);
  }

  public void set(quickfix.field.StreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlEnd get(quickfix.field.StreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlEnd getStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlEnd() {
    return isSetField(41288);
  }

  public void set(quickfix.field.StreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTimeType get(quickfix.field.StreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTimeType getStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTimeType() {
    return isSetField(41588);
  }
}
}

  public void set(quickfix.field.StreamCommoditySettlPeriodXID value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodXID get(quickfix.field.StreamCommoditySettlPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodXID getStreamCommoditySettlPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodXID());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodXID() {
    return isSetField(41301);
  }

  public void set(quickfix.field.StreamCommoditySettlPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlPeriodXIDRef get(quickfix.field.StreamCommoditySettlPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlPeriodXIDRef getStreamCommoditySettlPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlPeriodXIDRef() {
    return isSetField(41302);
  }
}

  public void set(quickfix.field.StreamCommodityXID value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityXID get(quickfix.field.StreamCommodityXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityXID getStreamCommodityXID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityXID());
  }

  public boolean isSet(quickfix.field.StreamCommodityXID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityXID() {
    return isSetField(41275);
  }

  public void set(quickfix.field.StreamCommodityXIDRef value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityXIDRef get(quickfix.field.StreamCommodityXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityXIDRef getStreamCommodityXIDRef() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityXIDRef());
  }

  public boolean isSet(quickfix.field.StreamCommodityXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityXIDRef() {
    return isSetField(41276);
  }
}
