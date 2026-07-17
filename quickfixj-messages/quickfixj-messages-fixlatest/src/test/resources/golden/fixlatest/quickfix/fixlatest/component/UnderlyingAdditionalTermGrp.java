/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingAdditionalTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42036, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingAdditionalTermGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingAdditionalTerms value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAdditionalTerms get(quickfix.field.NoUnderlyingAdditionalTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAdditionalTerms getNoUnderlyingAdditionalTerms() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAdditionalTerms());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAdditionalTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAdditionalTerms() {
    return isSetField(42036);
  }

public static class NoUnderlyingAdditionalTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42037, 42038, 41340, 0};

  public NoUnderlyingAdditionalTerms() {
    super(42036, 42037, ORDER);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator get(quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator getUnderlyingAdditionalTermConditionPrecedentBondIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermConditionPrecedentBondIndicator() {
    return isSetField(42037);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator get(quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator getUnderlyingAdditionalTermDiscrepancyClauseIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermDiscrepancyClauseIndicator() {
    return isSetField(42038);
  }

  public void set(quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp get(quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp getUnderlyingAdditionalTermBondRefGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp());
  }

  public void set(quickfix.field.NoUnderlyingAdditionalTermBondRefs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAdditionalTermBondRefs get(quickfix.field.NoUnderlyingAdditionalTermBondRefs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAdditionalTermBondRefs getNoUnderlyingAdditionalTermBondRefs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAdditionalTermBondRefs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAdditionalTermBondRefs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAdditionalTermBondRefs() {
    return isSetField(41340);
  }

public static class NoUnderlyingAdditionalTermBondRefs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41341, 41701, 41709, 41710, 41711, 41712, 42017, 42025, 42026, 42027, 42028, 42029, 42030, 42031, 42032, 42033, 42034, 42035, 0};

  public NoUnderlyingAdditionalTermBondRefs() {
    super(41340, 41341, ORDER);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondSecurityID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityID get(quickfix.field.UnderlyingAdditionalTermBondSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityID getUnderlyingAdditionalTermBondSecurityID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondSecurityID());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondSecurityID() {
    return isSetField(41341);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource get(quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource getUnderlyingAdditionalTermBondSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondSecurityIDSource() {
    return isSetField(41701);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondDesc get(quickfix.field.UnderlyingAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondDesc getUnderlyingAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondDesc() {
    return isSetField(41709);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen get(quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen getEncodedUnderlyingAdditionalTermBondDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondDescLen() {
    return isSetField(41710);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDesc get(quickfix.field.EncodedUnderlyingAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDesc getEncodedUnderlyingAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondDesc() {
    return isSetField(41711);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrency get(quickfix.field.UnderlyingAdditionalTermBondCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrency getUnderlyingAdditionalTermBondCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCurrency() {
    return isSetField(41712);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondIssuer get(quickfix.field.UnderlyingAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondIssuer getUnderlyingAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondIssuer() {
    return isSetField(42017);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen get(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen getEncodedUnderlyingAdditionalTermBondIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondIssuerLen() {
    return isSetField(42025);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer get(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer getEncodedUnderlyingAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondIssuer() {
    return isSetField(42026);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondSeniority value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondSeniority get(quickfix.field.UnderlyingAdditionalTermBondSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondSeniority getUnderlyingAdditionalTermBondSeniority() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondSeniority());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondSeniority field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondSeniority() {
    return isSetField(42027);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponType get(quickfix.field.UnderlyingAdditionalTermBondCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponType getUnderlyingAdditionalTermBondCouponType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponType());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponType() {
    return isSetField(42028);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponRate get(quickfix.field.UnderlyingAdditionalTermBondCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponRate getUnderlyingAdditionalTermBondCouponRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponRate());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponRate() {
    return isSetField(42029);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondMaturityDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondMaturityDate get(quickfix.field.UnderlyingAdditionalTermBondMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondMaturityDate getUnderlyingAdditionalTermBondMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondMaturityDate());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondMaturityDate() {
    return isSetField(42030);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondParValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondParValue get(quickfix.field.UnderlyingAdditionalTermBondParValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondParValue getUnderlyingAdditionalTermBondParValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondParValue());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondParValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondParValue() {
    return isSetField(42031);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount get(quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount getUnderlyingAdditionalTermBondCurrentTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCurrentTotalIssuedAmount() {
    return isSetField(42032);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod get(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod getUnderlyingAdditionalTermBondCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponFrequencyPeriod() {
    return isSetField(42033);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit get(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit getUnderlyingAdditionalTermBondCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponFrequencyUnit() {
    return isSetField(42034);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondDayCount get(quickfix.field.UnderlyingAdditionalTermBondDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondDayCount getUnderlyingAdditionalTermBondDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondDayCount() {
    return isSetField(42035);
  }
}
}

  public void set(quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator get(quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator getUnderlyingAdditionalTermConditionPrecedentBondIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermConditionPrecedentBondIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermConditionPrecedentBondIndicator() {
    return isSetField(42037);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator get(quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator getUnderlyingAdditionalTermDiscrepancyClauseIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermDiscrepancyClauseIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermDiscrepancyClauseIndicator() {
    return isSetField(42038);
  }

  public void set(quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp get(quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp getUnderlyingAdditionalTermBondRefGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingAdditionalTermBondRefGrp());
  }

  public void set(quickfix.field.NoUnderlyingAdditionalTermBondRefs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAdditionalTermBondRefs get(quickfix.field.NoUnderlyingAdditionalTermBondRefs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAdditionalTermBondRefs getNoUnderlyingAdditionalTermBondRefs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAdditionalTermBondRefs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAdditionalTermBondRefs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAdditionalTermBondRefs() {
    return isSetField(41340);
  }

public static class NoUnderlyingAdditionalTermBondRefs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41341, 41701, 41709, 41710, 41711, 41712, 42017, 42025, 42026, 42027, 42028, 42029, 42030, 42031, 42032, 42033, 42034, 42035, 0};

  public NoUnderlyingAdditionalTermBondRefs() {
    super(41340, 41341, ORDER);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondSecurityID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityID get(quickfix.field.UnderlyingAdditionalTermBondSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityID getUnderlyingAdditionalTermBondSecurityID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondSecurityID());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondSecurityID() {
    return isSetField(41341);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource get(quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource getUnderlyingAdditionalTermBondSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondSecurityIDSource() {
    return isSetField(41701);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondDesc get(quickfix.field.UnderlyingAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondDesc getUnderlyingAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondDesc() {
    return isSetField(41709);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen get(quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen getEncodedUnderlyingAdditionalTermBondDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondDescLen() {
    return isSetField(41710);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDesc get(quickfix.field.EncodedUnderlyingAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondDesc getEncodedUnderlyingAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondDesc() {
    return isSetField(41711);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrency get(quickfix.field.UnderlyingAdditionalTermBondCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrency getUnderlyingAdditionalTermBondCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCurrency() {
    return isSetField(41712);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondIssuer get(quickfix.field.UnderlyingAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondIssuer getUnderlyingAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondIssuer() {
    return isSetField(42017);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen get(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen getEncodedUnderlyingAdditionalTermBondIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondIssuerLen() {
    return isSetField(42025);
  }

  public void set(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer get(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer getEncodedUnderlyingAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingAdditionalTermBondIssuer() {
    return isSetField(42026);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondSeniority value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondSeniority get(quickfix.field.UnderlyingAdditionalTermBondSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondSeniority getUnderlyingAdditionalTermBondSeniority() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondSeniority());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondSeniority field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondSeniority() {
    return isSetField(42027);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponType get(quickfix.field.UnderlyingAdditionalTermBondCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponType getUnderlyingAdditionalTermBondCouponType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponType());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponType() {
    return isSetField(42028);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponRate get(quickfix.field.UnderlyingAdditionalTermBondCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponRate getUnderlyingAdditionalTermBondCouponRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponRate());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponRate() {
    return isSetField(42029);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondMaturityDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondMaturityDate get(quickfix.field.UnderlyingAdditionalTermBondMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondMaturityDate getUnderlyingAdditionalTermBondMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondMaturityDate());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondMaturityDate() {
    return isSetField(42030);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondParValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondParValue get(quickfix.field.UnderlyingAdditionalTermBondParValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondParValue getUnderlyingAdditionalTermBondParValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondParValue());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondParValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondParValue() {
    return isSetField(42031);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount get(quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount getUnderlyingAdditionalTermBondCurrentTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCurrentTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCurrentTotalIssuedAmount() {
    return isSetField(42032);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod get(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod getUnderlyingAdditionalTermBondCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponFrequencyPeriod() {
    return isSetField(42033);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit get(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit getUnderlyingAdditionalTermBondCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondCouponFrequencyUnit() {
    return isSetField(42034);
  }

  public void set(quickfix.field.UnderlyingAdditionalTermBondDayCount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingAdditionalTermBondDayCount get(quickfix.field.UnderlyingAdditionalTermBondDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingAdditionalTermBondDayCount getUnderlyingAdditionalTermBondDayCount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingAdditionalTermBondDayCount());
  }

  public boolean isSet(quickfix.field.UnderlyingAdditionalTermBondDayCount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingAdditionalTermBondDayCount() {
    return isSetField(42035);
  }
}
}
