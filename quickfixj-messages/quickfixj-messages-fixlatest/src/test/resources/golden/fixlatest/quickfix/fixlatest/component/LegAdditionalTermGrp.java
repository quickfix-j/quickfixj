/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegAdditionalTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41335, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegAdditionalTermGrp() {
    super();
  }

  public void set(quickfix.field.NoLegAdditionalTerms value) {
    setField(value);
  }

  public quickfix.field.NoLegAdditionalTerms get(quickfix.field.NoLegAdditionalTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAdditionalTerms getNoLegAdditionalTerms() throws FieldNotFound {
    return get(new quickfix.field.NoLegAdditionalTerms());
  }

  public boolean isSet(quickfix.field.NoLegAdditionalTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAdditionalTerms() {
    return isSetField(41335);
  }

public static class NoLegAdditionalTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41336, 41337, 41316, 0};

  public NoLegAdditionalTerms() {
    super(41335, 41336, ORDER);
  }

  public void set(quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator get(quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator getLegAdditionalTermConditionPrecedentBondIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermConditionPrecedentBondIndicator() {
    return isSetField(41336);
  }

  public void set(quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator get(quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator getLegAdditionalTermDiscrepancyClauseIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermDiscrepancyClauseIndicator() {
    return isSetField(41337);
  }

  public void set(quickfix.fixlatest.component.LegAdditionalTermBondRefGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegAdditionalTermBondRefGrp get(quickfix.fixlatest.component.LegAdditionalTermBondRefGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegAdditionalTermBondRefGrp getLegAdditionalTermBondRefGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegAdditionalTermBondRefGrp());
  }

  public void set(quickfix.field.NoLegAdditionalTermBondRefs value) {
    setField(value);
  }

  public quickfix.field.NoLegAdditionalTermBondRefs get(quickfix.field.NoLegAdditionalTermBondRefs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAdditionalTermBondRefs getNoLegAdditionalTermBondRefs() throws FieldNotFound {
    return get(new quickfix.field.NoLegAdditionalTermBondRefs());
  }

  public boolean isSet(quickfix.field.NoLegAdditionalTermBondRefs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAdditionalTermBondRefs() {
    return isSetField(41316);
  }

public static class NoLegAdditionalTermBondRefs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41317, 41318, 41319, 41320, 41321, 41322, 41323, 41324, 41325, 41326, 41327, 41328, 41329, 41330, 41331, 41332, 41333, 41334, 0};

  public NoLegAdditionalTermBondRefs() {
    super(41316, 41317, ORDER);
  }

  public void set(quickfix.field.LegAdditionalTermBondSecurityID value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondSecurityID get(quickfix.field.LegAdditionalTermBondSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondSecurityID getLegAdditionalTermBondSecurityID() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondSecurityID());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondSecurityID() {
    return isSetField(41317);
  }

  public void set(quickfix.field.LegAdditionalTermBondSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondSecurityIDSource get(quickfix.field.LegAdditionalTermBondSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondSecurityIDSource getLegAdditionalTermBondSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondSecurityIDSource());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondSecurityIDSource() {
    return isSetField(41318);
  }

  public void set(quickfix.field.LegAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondDesc get(quickfix.field.LegAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondDesc getLegAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondDesc() {
    return isSetField(41319);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondDescLen get(quickfix.field.EncodedLegAdditionalTermBondDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondDescLen getEncodedLegAdditionalTermBondDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondDescLen() {
    return isSetField(41320);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondDesc get(quickfix.field.EncodedLegAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondDesc getEncodedLegAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondDesc() {
    return isSetField(41321);
  }

  public void set(quickfix.field.LegAdditionalTermBondCurrency value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCurrency get(quickfix.field.LegAdditionalTermBondCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCurrency getLegAdditionalTermBondCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCurrency());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCurrency() {
    return isSetField(41322);
  }

  public void set(quickfix.field.LegAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondIssuer get(quickfix.field.LegAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondIssuer getLegAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondIssuer() {
    return isSetField(41323);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuerLen get(quickfix.field.EncodedLegAdditionalTermBondIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuerLen getEncodedLegAdditionalTermBondIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondIssuerLen() {
    return isSetField(41324);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuer get(quickfix.field.EncodedLegAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuer getEncodedLegAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondIssuer() {
    return isSetField(41325);
  }

  public void set(quickfix.field.LegAdditionalTermBondSeniority value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondSeniority get(quickfix.field.LegAdditionalTermBondSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondSeniority getLegAdditionalTermBondSeniority() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondSeniority());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondSeniority field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondSeniority() {
    return isSetField(41326);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponType value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponType get(quickfix.field.LegAdditionalTermBondCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponType getLegAdditionalTermBondCouponType() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponType());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponType field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponType() {
    return isSetField(41327);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponRate value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponRate get(quickfix.field.LegAdditionalTermBondCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponRate getLegAdditionalTermBondCouponRate() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponRate());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponRate() {
    return isSetField(41328);
  }

  public void set(quickfix.field.LegAdditionalTermBondMaturityDate value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondMaturityDate get(quickfix.field.LegAdditionalTermBondMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondMaturityDate getLegAdditionalTermBondMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondMaturityDate());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondMaturityDate() {
    return isSetField(41329);
  }

  public void set(quickfix.field.LegAdditionalTermBondParValue value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondParValue get(quickfix.field.LegAdditionalTermBondParValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondParValue getLegAdditionalTermBondParValue() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondParValue());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondParValue field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondParValue() {
    return isSetField(41330);
  }

  public void set(quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount get(quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount getLegAdditionalTermBondCurrentTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCurrentTotalIssuedAmount() {
    return isSetField(41331);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod get(quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod getLegAdditionalTermBondCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponFrequencyPeriod() {
    return isSetField(41332);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyUnit get(quickfix.field.LegAdditionalTermBondCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyUnit getLegAdditionalTermBondCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponFrequencyUnit() {
    return isSetField(41333);
  }

  public void set(quickfix.field.LegAdditionalTermBondDayCount value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondDayCount get(quickfix.field.LegAdditionalTermBondDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondDayCount getLegAdditionalTermBondDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondDayCount());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondDayCount() {
    return isSetField(41334);
  }
}
}

  public void set(quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator get(quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator getLegAdditionalTermConditionPrecedentBondIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermConditionPrecedentBondIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermConditionPrecedentBondIndicator() {
    return isSetField(41336);
  }

  public void set(quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator get(quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator getLegAdditionalTermDiscrepancyClauseIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermDiscrepancyClauseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermDiscrepancyClauseIndicator() {
    return isSetField(41337);
  }

  public void set(quickfix.fixlatest.component.LegAdditionalTermBondRefGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegAdditionalTermBondRefGrp get(quickfix.fixlatest.component.LegAdditionalTermBondRefGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegAdditionalTermBondRefGrp getLegAdditionalTermBondRefGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegAdditionalTermBondRefGrp());
  }

  public void set(quickfix.field.NoLegAdditionalTermBondRefs value) {
    setField(value);
  }

  public quickfix.field.NoLegAdditionalTermBondRefs get(quickfix.field.NoLegAdditionalTermBondRefs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegAdditionalTermBondRefs getNoLegAdditionalTermBondRefs() throws FieldNotFound {
    return get(new quickfix.field.NoLegAdditionalTermBondRefs());
  }

  public boolean isSet(quickfix.field.NoLegAdditionalTermBondRefs field) {
    return isSetField(field);
  }

  public boolean isSetNoLegAdditionalTermBondRefs() {
    return isSetField(41316);
  }

public static class NoLegAdditionalTermBondRefs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41317, 41318, 41319, 41320, 41321, 41322, 41323, 41324, 41325, 41326, 41327, 41328, 41329, 41330, 41331, 41332, 41333, 41334, 0};

  public NoLegAdditionalTermBondRefs() {
    super(41316, 41317, ORDER);
  }

  public void set(quickfix.field.LegAdditionalTermBondSecurityID value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondSecurityID get(quickfix.field.LegAdditionalTermBondSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondSecurityID getLegAdditionalTermBondSecurityID() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondSecurityID());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondSecurityID() {
    return isSetField(41317);
  }

  public void set(quickfix.field.LegAdditionalTermBondSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondSecurityIDSource get(quickfix.field.LegAdditionalTermBondSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondSecurityIDSource getLegAdditionalTermBondSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondSecurityIDSource());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondSecurityIDSource() {
    return isSetField(41318);
  }

  public void set(quickfix.field.LegAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondDesc get(quickfix.field.LegAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondDesc getLegAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondDesc() {
    return isSetField(41319);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondDescLen get(quickfix.field.EncodedLegAdditionalTermBondDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondDescLen getEncodedLegAdditionalTermBondDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondDescLen() {
    return isSetField(41320);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondDesc get(quickfix.field.EncodedLegAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondDesc getEncodedLegAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondDesc() {
    return isSetField(41321);
  }

  public void set(quickfix.field.LegAdditionalTermBondCurrency value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCurrency get(quickfix.field.LegAdditionalTermBondCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCurrency getLegAdditionalTermBondCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCurrency());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCurrency() {
    return isSetField(41322);
  }

  public void set(quickfix.field.LegAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondIssuer get(quickfix.field.LegAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondIssuer getLegAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondIssuer() {
    return isSetField(41323);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuerLen get(quickfix.field.EncodedLegAdditionalTermBondIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuerLen getEncodedLegAdditionalTermBondIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondIssuerLen() {
    return isSetField(41324);
  }

  public void set(quickfix.field.EncodedLegAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuer get(quickfix.field.EncodedLegAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegAdditionalTermBondIssuer getEncodedLegAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.EncodedLegAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegAdditionalTermBondIssuer() {
    return isSetField(41325);
  }

  public void set(quickfix.field.LegAdditionalTermBondSeniority value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondSeniority get(quickfix.field.LegAdditionalTermBondSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondSeniority getLegAdditionalTermBondSeniority() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondSeniority());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondSeniority field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondSeniority() {
    return isSetField(41326);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponType value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponType get(quickfix.field.LegAdditionalTermBondCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponType getLegAdditionalTermBondCouponType() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponType());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponType field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponType() {
    return isSetField(41327);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponRate value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponRate get(quickfix.field.LegAdditionalTermBondCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponRate getLegAdditionalTermBondCouponRate() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponRate());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponRate() {
    return isSetField(41328);
  }

  public void set(quickfix.field.LegAdditionalTermBondMaturityDate value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondMaturityDate get(quickfix.field.LegAdditionalTermBondMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondMaturityDate getLegAdditionalTermBondMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondMaturityDate());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondMaturityDate() {
    return isSetField(41329);
  }

  public void set(quickfix.field.LegAdditionalTermBondParValue value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondParValue get(quickfix.field.LegAdditionalTermBondParValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondParValue getLegAdditionalTermBondParValue() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondParValue());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondParValue field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondParValue() {
    return isSetField(41330);
  }

  public void set(quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount get(quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount getLegAdditionalTermBondCurrentTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCurrentTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCurrentTotalIssuedAmount() {
    return isSetField(41331);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod get(quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod getLegAdditionalTermBondCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponFrequencyPeriod() {
    return isSetField(41332);
  }

  public void set(quickfix.field.LegAdditionalTermBondCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyUnit get(quickfix.field.LegAdditionalTermBondCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondCouponFrequencyUnit getLegAdditionalTermBondCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondCouponFrequencyUnit() {
    return isSetField(41333);
  }

  public void set(quickfix.field.LegAdditionalTermBondDayCount value) {
    setField(value);
  }

  public quickfix.field.LegAdditionalTermBondDayCount get(quickfix.field.LegAdditionalTermBondDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAdditionalTermBondDayCount getLegAdditionalTermBondDayCount() throws FieldNotFound {
    return get(new quickfix.field.LegAdditionalTermBondDayCount());
  }

  public boolean isSet(quickfix.field.LegAdditionalTermBondDayCount field) {
    return isSetField(field);
  }

  public boolean isSetLegAdditionalTermBondDayCount() {
    return isSetField(41334);
  }
}
}
