/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCommodity extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41964, 41965, 41966, 41967, 41968, 41969, 41970, 42589, 41971, 41972, 41973, 41974, 41975, 41976, 41977, 41978, 41979, 41980, 41981, 41982, 41983, 41984, 41985, 41986, 41987, 41988, 41989, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCommodity() {
    super();
  }

  public void set(quickfix.field.UnderlyingStreamCommodityBase value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityBase get(quickfix.field.UnderlyingStreamCommodityBase value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityBase getUnderlyingStreamCommodityBase() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityBase());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityBase field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityBase() {
    return isSetField(41964);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityType get(quickfix.field.UnderlyingStreamCommodityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityType getUnderlyingStreamCommodityType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityType() {
    return isSetField(41965);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySecurityID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySecurityID get(quickfix.field.UnderlyingStreamCommoditySecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySecurityID getUnderlyingStreamCommoditySecurityID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySecurityID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySecurityID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySecurityID() {
    return isSetField(41966);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySecurityIDSource get(quickfix.field.UnderlyingStreamCommoditySecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySecurityIDSource getUnderlyingStreamCommoditySecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySecurityIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySecurityIDSource() {
    return isSetField(41967);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommodityAltIDGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodityAltIDGrp get(quickfix.fixlatest.component.UnderlyingStreamCommodityAltIDGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodityAltIDGrp getUnderlyingStreamCommodityAltIDGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommodityAltIDGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommodityAltIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommodityAltIDs get(quickfix.field.NoUnderlyingStreamCommodityAltIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommodityAltIDs getNoUnderlyingStreamCommodityAltIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommodityAltIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommodityAltIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommodityAltIDs() {
    return isSetField(41990);
  }

public static class NoUnderlyingStreamCommodityAltIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41991, 41992, 0};

  public NoUnderlyingStreamCommodityAltIDs() {
    super(41990, 41991, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityAltID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityAltID get(quickfix.field.UnderlyingStreamCommodityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityAltID getUnderlyingStreamCommodityAltID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityAltID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityAltID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityAltID() {
    return isSetField(41991);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityAltIDSource get(quickfix.field.UnderlyingStreamCommodityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityAltIDSource getUnderlyingStreamCommodityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityAltIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityAltIDSource() {
    return isSetField(41992);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommodityDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityDesc get(quickfix.field.UnderlyingStreamCommodityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityDesc getUnderlyingStreamCommodityDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityDesc() {
    return isSetField(41968);
  }

  public void set(quickfix.field.EncodedUnderlyingStreamCommodityDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingStreamCommodityDescLen get(quickfix.field.EncodedUnderlyingStreamCommodityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingStreamCommodityDescLen getEncodedUnderlyingStreamCommodityDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingStreamCommodityDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingStreamCommodityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingStreamCommodityDescLen() {
    return isSetField(41969);
  }

  public void set(quickfix.field.EncodedUnderlyingStreamCommodityDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingStreamCommodityDesc get(quickfix.field.EncodedUnderlyingStreamCommodityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingStreamCommodityDesc getEncodedUnderlyingStreamCommodityDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingStreamCommodityDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingStreamCommodityDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingStreamCommodityDesc() {
    return isSetField(41970);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityDeliveryPricingRegion value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityDeliveryPricingRegion get(quickfix.field.UnderlyingStreamCommodityDeliveryPricingRegion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityDeliveryPricingRegion getUnderlyingStreamCommodityDeliveryPricingRegion() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityDeliveryPricingRegion());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityDeliveryPricingRegion field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityDeliveryPricingRegion() {
    return isSetField(42589);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamAssetAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamAssetAttributeGrp get(quickfix.fixlatest.component.UnderlyingStreamAssetAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamAssetAttributeGrp getUnderlyingStreamAssetAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamAssetAttributeGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamAssetAttributes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamAssetAttributes get(quickfix.field.NoUnderlyingStreamAssetAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamAssetAttributes getNoUnderlyingStreamAssetAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamAssetAttributes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamAssetAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamAssetAttributes() {
    return isSetField(41800);
  }

public static class NoUnderlyingStreamAssetAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41801, 41802, 41803, 0};

  public NoUnderlyingStreamAssetAttributes() {
    super(41800, 41801, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamAssetAttributeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamAssetAttributeType get(quickfix.field.UnderlyingStreamAssetAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamAssetAttributeType getUnderlyingStreamAssetAttributeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamAssetAttributeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamAssetAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamAssetAttributeType() {
    return isSetField(41801);
  }

  public void set(quickfix.field.UnderlyingStreamAssetAttributeValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamAssetAttributeValue get(quickfix.field.UnderlyingStreamAssetAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamAssetAttributeValue getUnderlyingStreamAssetAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamAssetAttributeValue());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamAssetAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamAssetAttributeValue() {
    return isSetField(41802);
  }

  public void set(quickfix.field.UnderlyingStreamAssetAttributeLimit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamAssetAttributeLimit get(quickfix.field.UnderlyingStreamAssetAttributeLimit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamAssetAttributeLimit getUnderlyingStreamAssetAttributeLimit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamAssetAttributeLimit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamAssetAttributeLimit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamAssetAttributeLimit() {
    return isSetField(41803);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommodityUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityUnitOfMeasure get(quickfix.field.UnderlyingStreamCommodityUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityUnitOfMeasure getUnderlyingStreamCommodityUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityUnitOfMeasure() {
    return isSetField(41971);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityCurrency get(quickfix.field.UnderlyingStreamCommodityCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityCurrency getUnderlyingStreamCommodityCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityCurrency() {
    return isSetField(41972);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityExchange value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityExchange get(quickfix.field.UnderlyingStreamCommodityExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityExchange getUnderlyingStreamCommodityExchange() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityExchange());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityExchange field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityExchange() {
    return isSetField(41973);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityRateSource get(quickfix.field.UnderlyingStreamCommodityRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityRateSource getUnderlyingStreamCommodityRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityRateSource() {
    return isSetField(41974);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityRateReferencePage get(quickfix.field.UnderlyingStreamCommodityRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityRateReferencePage getUnderlyingStreamCommodityRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityRateReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityRateReferencePage() {
    return isSetField(41975);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityRateReferencePageHeading get(quickfix.field.UnderlyingStreamCommodityRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityRateReferencePageHeading getUnderlyingStreamCommodityRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityRateReferencePageHeading() {
    return isSetField(41976);
  }

  public void set(quickfix.field.UnderlyingStreamDataProvider value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamDataProvider get(quickfix.field.UnderlyingStreamDataProvider value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamDataProvider getUnderlyingStreamDataProvider() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamDataProvider());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamDataProvider field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamDataProvider() {
    return isSetField(41977);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommodityDataSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodityDataSourceGrp get(quickfix.fixlatest.component.UnderlyingStreamCommodityDataSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommodityDataSourceGrp getUnderlyingStreamCommodityDataSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommodityDataSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommodityDataSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommodityDataSources get(quickfix.field.NoUnderlyingStreamCommodityDataSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommodityDataSources getNoUnderlyingStreamCommodityDataSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommodityDataSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommodityDataSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommodityDataSources() {
    return isSetField(41993);
  }

public static class NoUnderlyingStreamCommodityDataSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41994, 41995, 0};

  public NoUnderlyingStreamCommodityDataSources() {
    super(41993, 41994, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityDataSourceID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceID get(quickfix.field.UnderlyingStreamCommodityDataSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceID getUnderlyingStreamCommodityDataSourceID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityDataSourceID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityDataSourceID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityDataSourceID() {
    return isSetField(41994);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityDataSourceIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceIDType get(quickfix.field.UnderlyingStreamCommodityDataSourceIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceIDType getUnderlyingStreamCommodityDataSourceIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityDataSourceIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityDataSourceIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityDataSourceIDType() {
    return isSetField(41995);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommodityPricingType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityPricingType get(quickfix.field.UnderlyingStreamCommodityPricingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityPricingType getUnderlyingStreamCommodityPricingType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityPricingType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityPricingType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityPricingType() {
    return isSetField(41978);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityNearbySettlDayPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityNearbySettlDayPeriod get(quickfix.field.UnderlyingStreamCommodityNearbySettlDayPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityNearbySettlDayPeriod getUnderlyingStreamCommodityNearbySettlDayPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityNearbySettlDayPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityNearbySettlDayPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityNearbySettlDayPeriod() {
    return isSetField(41979);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityNearbySettlDayUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityNearbySettlDayUnit get(quickfix.field.UnderlyingStreamCommodityNearbySettlDayUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityNearbySettlDayUnit getUnderlyingStreamCommodityNearbySettlDayUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityNearbySettlDayUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityNearbySettlDayUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityNearbySettlDayUnit() {
    return isSetField(41980);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateUnadjusted get(quickfix.field.UnderlyingStreamCommoditySettlDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateUnadjusted getUnderlyingStreamCommoditySettlDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDateUnadjusted() {
    return isSetField(41981);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateBusinessDayConvention get(quickfix.field.UnderlyingStreamCommoditySettlDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateBusinessDayConvention getUnderlyingStreamCommoditySettlDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDateBusinessDayConvention() {
    return isSetField(41982);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlBusinessCenterGrp getUnderlyingStreamCommoditySettlBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters get(quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters getNoUnderlyingStreamCommoditySettlBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlBusinessCenters() {
    return isSetField(41962);
  }

public static class NoUnderlyingStreamCommoditySettlBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41963, 0};

  public NoUnderlyingStreamCommoditySettlBusinessCenters() {
    super(41962, 41963, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter get(quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter getUnderlyingStreamCommoditySettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlBusinessCenter() {
    return isSetField(41963);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateAdjusted get(quickfix.field.UnderlyingStreamCommoditySettlDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateAdjusted getUnderlyingStreamCommoditySettlDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDateAdjusted() {
    return isSetField(41983);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlMonth value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlMonth get(quickfix.field.UnderlyingStreamCommoditySettlMonth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlMonth getUnderlyingStreamCommoditySettlMonth() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlMonth());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlMonth field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlMonth() {
    return isSetField(41984);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDateRollPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateRollPeriod get(quickfix.field.UnderlyingStreamCommoditySettlDateRollPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateRollPeriod getUnderlyingStreamCommoditySettlDateRollPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDateRollPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDateRollPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDateRollPeriod() {
    return isSetField(41985);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDateRollUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateRollUnit get(quickfix.field.UnderlyingStreamCommoditySettlDateRollUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDateRollUnit getUnderlyingStreamCommoditySettlDateRollUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDateRollUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDateRollUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDateRollUnit() {
    return isSetField(41986);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDayType get(quickfix.field.UnderlyingStreamCommoditySettlDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDayType getUnderlyingStreamCommoditySettlDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDayType() {
    return isSetField(41987);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlPeriodGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlPeriodGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlPeriodGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlPeriodGrp getUnderlyingStreamCommoditySettlPeriodGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlPeriodGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlPeriods value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlPeriods get(quickfix.field.NoUnderlyingStreamCommoditySettlPeriods value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlPeriods getNoUnderlyingStreamCommoditySettlPeriods() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlPeriods());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlPeriods field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlPeriods() {
    return isSetField(42002);
  }

public static class NoUnderlyingStreamCommoditySettlPeriods extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42003, 42004, 42005, 42006, 42007, 42008, 42009, 42010, 42011, 42012, 42013, 41996, 42014, 42015, 0};

  public NoUnderlyingStreamCommoditySettlPeriods() {
    super(42002, 42003, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlCountry value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlCountry get(quickfix.field.UnderlyingStreamCommoditySettlCountry value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlCountry getUnderlyingStreamCommoditySettlCountry() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlCountry());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlCountry field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlCountry() {
    return isSetField(42003);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeZone value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeZone get(quickfix.field.UnderlyingStreamCommoditySettlTimeZone value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeZone getUnderlyingStreamCommoditySettlTimeZone() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeZone());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeZone field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeZone() {
    return isSetField(42004);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlFlowType get(quickfix.field.UnderlyingStreamCommoditySettlFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlFlowType getUnderlyingStreamCommoditySettlFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlFlowType() {
    return isSetField(42005);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional get(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional getUnderlyingStreamCommoditySettlPeriodNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodNotional() {
    return isSetField(42006);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure get(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure getUnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodNotionalUnitOfMeasure() {
    return isSetField(42007);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod get(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod getUnderlyingStreamCommoditySettlPeriodFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodFrequencyPeriod() {
    return isSetField(42008);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit get(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit getUnderlyingStreamCommoditySettlPeriodFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodFrequencyUnit() {
    return isSetField(42009);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice get(quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice getUnderlyingStreamCommoditySettlPeriodPrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodPrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodPrice() {
    return isSetField(42010);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure get(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure getUnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodPriceUnitOfMeasure() {
    return isSetField(42011);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency get(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency getUnderlyingStreamCommoditySettlPeriodPriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodPriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodPriceCurrency() {
    return isSetField(42012);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction get(quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction getUnderlyingStreamCommoditySettlHolidaysProcessingInstruction() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlHolidaysProcessingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlHolidaysProcessingInstruction() {
    return isSetField(42013);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp getUnderlyingStreamCommoditySettlDayGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlDayGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlDays value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlDays get(quickfix.field.NoUnderlyingStreamCommoditySettlDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlDays getNoUnderlyingStreamCommoditySettlDays() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlDays());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlDays field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlDays() {
    return isSetField(41996);
  }

public static class NoUnderlyingStreamCommoditySettlDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41997, 41998, 41999, 0};

  public NoUnderlyingStreamCommoditySettlDays() {
    super(41996, 41997, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlDay value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay get(quickfix.field.UnderlyingStreamCommoditySettlDay value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlDay getUnderlyingStreamCommoditySettlDay() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlDay());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlDay field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlDay() {
    return isSetField(41997);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours get(quickfix.field.UnderlyingStreamCommoditySettlTotalHours value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTotalHours getUnderlyingStreamCommoditySettlTotalHours() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTotalHours());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTotalHours field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTotalHours() {
    return isSetField(41998);
  }

  public void set(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp get(quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp getUnderlyingStreamCommoditySettlTimeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingStreamCommoditySettlTimeGrp());
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes get(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes getNoUnderlyingStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlTimes() {
    return isSetField(41999);
  }

public static class NoUnderlyingStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42000, 42001, 41936, 0};

  public NoUnderlyingStreamCommoditySettlTimes() {
    super(41999, 42000, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart get(quickfix.field.UnderlyingStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart getUnderlyingStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlStart() {
    return isSetField(42000);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd get(quickfix.field.UnderlyingStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd getUnderlyingStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlEnd() {
    return isSetField(42001);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType get(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType getUnderlyingStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeType() {
    return isSetField(41936);
  }
}
}

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXID get(quickfix.field.UnderlyingStreamCommoditySettlPeriodXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXID getUnderlyingStreamCommoditySettlPeriodXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodXID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodXID() {
    return isSetField(42014);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef get(quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef getUnderlyingStreamCommoditySettlPeriodXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlPeriodXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlPeriodXIDRef() {
    return isSetField(42015);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommodityXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityXID get(quickfix.field.UnderlyingStreamCommodityXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityXID getUnderlyingStreamCommodityXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityXID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityXID() {
    return isSetField(41988);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityXIDRef value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityXIDRef get(quickfix.field.UnderlyingStreamCommodityXIDRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityXIDRef getUnderlyingStreamCommodityXIDRef() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityXIDRef());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityXIDRef field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityXIDRef() {
    return isSetField(41989);
  }
}
