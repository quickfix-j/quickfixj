/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AdditionalTermBondRefGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40000, };
  protected int[] getGroupFields() { return componentGroups; }

  public AdditionalTermBondRefGrp() {
    super();
  }

  public void set(quickfix.field.NoAdditionalTermBondRefs value) {
    setField(value);
  }

  public quickfix.field.NoAdditionalTermBondRefs get(quickfix.field.NoAdditionalTermBondRefs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAdditionalTermBondRefs getNoAdditionalTermBondRefs() throws FieldNotFound {
    return get(new quickfix.field.NoAdditionalTermBondRefs());
  }

  public boolean isSet(quickfix.field.NoAdditionalTermBondRefs field) {
    return isSetField(field);
  }

  public boolean isSetNoAdditionalTermBondRefs() {
    return isSetField(40000);
  }

public static class NoAdditionalTermBondRefs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40001, 40002, 40003, 40004, 40005, 40006, 40007, 40008, 40009, 40010, 40011, 40012, 40013, 40014, 40015, 40016, 40017, 40018, 0};

  public NoAdditionalTermBondRefs() {
    super(40000, 40001, ORDER);
  }

  public void set(quickfix.field.AdditionalTermBondSecurityID value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondSecurityID get(quickfix.field.AdditionalTermBondSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondSecurityID getAdditionalTermBondSecurityID() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondSecurityID());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondSecurityID() {
    return isSetField(40001);
  }

  public void set(quickfix.field.AdditionalTermBondSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondSecurityIDSource get(quickfix.field.AdditionalTermBondSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondSecurityIDSource getAdditionalTermBondSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondSecurityIDSource());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondSecurityIDSource() {
    return isSetField(40002);
  }

  public void set(quickfix.field.AdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondDesc get(quickfix.field.AdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondDesc getAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondDesc() {
    return isSetField(40003);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondDescLen get(quickfix.field.EncodedAdditionalTermBondDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondDescLen getEncodedAdditionalTermBondDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondDescLen());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondDescLen() {
    return isSetField(40004);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondDesc get(quickfix.field.EncodedAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondDesc getEncodedAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondDesc() {
    return isSetField(40005);
  }

  public void set(quickfix.field.AdditionalTermBondCurrency value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCurrency get(quickfix.field.AdditionalTermBondCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCurrency getAdditionalTermBondCurrency() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCurrency());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCurrency() {
    return isSetField(40006);
  }

  public void set(quickfix.field.AdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondIssuer get(quickfix.field.AdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondIssuer getAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondIssuer() {
    return isSetField(40007);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondIssuerLen get(quickfix.field.EncodedAdditionalTermBondIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondIssuerLen getEncodedAdditionalTermBondIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondIssuerLen() {
    return isSetField(40008);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondIssuer get(quickfix.field.EncodedAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondIssuer getEncodedAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondIssuer() {
    return isSetField(40009);
  }

  public void set(quickfix.field.AdditionalTermBondSeniority value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondSeniority get(quickfix.field.AdditionalTermBondSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondSeniority getAdditionalTermBondSeniority() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondSeniority());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondSeniority field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondSeniority() {
    return isSetField(40010);
  }

  public void set(quickfix.field.AdditionalTermBondCouponType value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponType get(quickfix.field.AdditionalTermBondCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponType getAdditionalTermBondCouponType() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponType());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponType field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponType() {
    return isSetField(40011);
  }

  public void set(quickfix.field.AdditionalTermBondCouponRate value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponRate get(quickfix.field.AdditionalTermBondCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponRate getAdditionalTermBondCouponRate() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponRate());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponRate() {
    return isSetField(40012);
  }

  public void set(quickfix.field.AdditionalTermBondMaturityDate value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondMaturityDate get(quickfix.field.AdditionalTermBondMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondMaturityDate getAdditionalTermBondMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondMaturityDate());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondMaturityDate() {
    return isSetField(40013);
  }

  public void set(quickfix.field.AdditionalTermBondParValue value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondParValue get(quickfix.field.AdditionalTermBondParValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondParValue getAdditionalTermBondParValue() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondParValue());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondParValue field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondParValue() {
    return isSetField(40014);
  }

  public void set(quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount get(quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount getAdditionalTermBondCurrentTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCurrentTotalIssuedAmount() {
    return isSetField(40015);
  }

  public void set(quickfix.field.AdditionalTermBondCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyPeriod get(quickfix.field.AdditionalTermBondCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyPeriod getAdditionalTermBondCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponFrequencyPeriod() {
    return isSetField(40016);
  }

  public void set(quickfix.field.AdditionalTermBondCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyUnit get(quickfix.field.AdditionalTermBondCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyUnit getAdditionalTermBondCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponFrequencyUnit() {
    return isSetField(40017);
  }

  public void set(quickfix.field.AdditionalTermBondDayCount value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondDayCount get(quickfix.field.AdditionalTermBondDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondDayCount getAdditionalTermBondDayCount() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondDayCount());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondDayCount field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondDayCount() {
    return isSetField(40018);
  }
}

  public void set(quickfix.field.AdditionalTermBondSecurityID value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondSecurityID get(quickfix.field.AdditionalTermBondSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondSecurityID getAdditionalTermBondSecurityID() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondSecurityID());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondSecurityID() {
    return isSetField(40001);
  }

  public void set(quickfix.field.AdditionalTermBondSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondSecurityIDSource get(quickfix.field.AdditionalTermBondSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondSecurityIDSource getAdditionalTermBondSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondSecurityIDSource());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondSecurityIDSource() {
    return isSetField(40002);
  }

  public void set(quickfix.field.AdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondDesc get(quickfix.field.AdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondDesc getAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondDesc() {
    return isSetField(40003);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondDescLen get(quickfix.field.EncodedAdditionalTermBondDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondDescLen getEncodedAdditionalTermBondDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondDescLen());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondDescLen() {
    return isSetField(40004);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondDesc get(quickfix.field.EncodedAdditionalTermBondDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondDesc getEncodedAdditionalTermBondDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondDesc());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondDesc() {
    return isSetField(40005);
  }

  public void set(quickfix.field.AdditionalTermBondCurrency value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCurrency get(quickfix.field.AdditionalTermBondCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCurrency getAdditionalTermBondCurrency() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCurrency());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCurrency() {
    return isSetField(40006);
  }

  public void set(quickfix.field.AdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondIssuer get(quickfix.field.AdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondIssuer getAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondIssuer() {
    return isSetField(40007);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondIssuerLen value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondIssuerLen get(quickfix.field.EncodedAdditionalTermBondIssuerLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondIssuerLen getEncodedAdditionalTermBondIssuerLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondIssuerLen());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondIssuerLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondIssuerLen() {
    return isSetField(40008);
  }

  public void set(quickfix.field.EncodedAdditionalTermBondIssuer value) {
    setField(value);
  }

  public quickfix.field.EncodedAdditionalTermBondIssuer get(quickfix.field.EncodedAdditionalTermBondIssuer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedAdditionalTermBondIssuer getEncodedAdditionalTermBondIssuer() throws FieldNotFound {
    return get(new quickfix.field.EncodedAdditionalTermBondIssuer());
  }

  public boolean isSet(quickfix.field.EncodedAdditionalTermBondIssuer field) {
    return isSetField(field);
  }

  public boolean isSetEncodedAdditionalTermBondIssuer() {
    return isSetField(40009);
  }

  public void set(quickfix.field.AdditionalTermBondSeniority value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondSeniority get(quickfix.field.AdditionalTermBondSeniority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondSeniority getAdditionalTermBondSeniority() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondSeniority());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondSeniority field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondSeniority() {
    return isSetField(40010);
  }

  public void set(quickfix.field.AdditionalTermBondCouponType value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponType get(quickfix.field.AdditionalTermBondCouponType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponType getAdditionalTermBondCouponType() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponType());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponType field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponType() {
    return isSetField(40011);
  }

  public void set(quickfix.field.AdditionalTermBondCouponRate value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponRate get(quickfix.field.AdditionalTermBondCouponRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponRate getAdditionalTermBondCouponRate() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponRate());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponRate field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponRate() {
    return isSetField(40012);
  }

  public void set(quickfix.field.AdditionalTermBondMaturityDate value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondMaturityDate get(quickfix.field.AdditionalTermBondMaturityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondMaturityDate getAdditionalTermBondMaturityDate() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondMaturityDate());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondMaturityDate field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondMaturityDate() {
    return isSetField(40013);
  }

  public void set(quickfix.field.AdditionalTermBondParValue value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondParValue get(quickfix.field.AdditionalTermBondParValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondParValue getAdditionalTermBondParValue() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondParValue());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondParValue field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondParValue() {
    return isSetField(40014);
  }

  public void set(quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount get(quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount getAdditionalTermBondCurrentTotalIssuedAmount() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCurrentTotalIssuedAmount field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCurrentTotalIssuedAmount() {
    return isSetField(40015);
  }

  public void set(quickfix.field.AdditionalTermBondCouponFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyPeriod get(quickfix.field.AdditionalTermBondCouponFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyPeriod getAdditionalTermBondCouponFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponFrequencyPeriod() {
    return isSetField(40016);
  }

  public void set(quickfix.field.AdditionalTermBondCouponFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyUnit get(quickfix.field.AdditionalTermBondCouponFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondCouponFrequencyUnit getAdditionalTermBondCouponFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondCouponFrequencyUnit());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondCouponFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondCouponFrequencyUnit() {
    return isSetField(40017);
  }

  public void set(quickfix.field.AdditionalTermBondDayCount value) {
    setField(value);
  }

  public quickfix.field.AdditionalTermBondDayCount get(quickfix.field.AdditionalTermBondDayCount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AdditionalTermBondDayCount getAdditionalTermBondDayCount() throws FieldNotFound {
    return get(new quickfix.field.AdditionalTermBondDayCount());
  }

  public boolean isSet(quickfix.field.AdditionalTermBondDayCount field) {
    return isSetField(field);
  }

  public boolean isSetAdditionalTermBondDayCount() {
    return isSetField(40018);
  }
}
