/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingCashSettlTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42041, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingCashSettlTermGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingCashSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingCashSettlTerms get(quickfix.field.NoUnderlyingCashSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingCashSettlTerms getNoUnderlyingCashSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingCashSettlTerms());
  }

  public boolean isSet(quickfix.field.NoUnderlyingCashSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingCashSettlTerms() {
    return isSetField(42041);
  }

public static class NoUnderlyingCashSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42042, 42043, 42044, 42045, 42046, 42047, 42048, 42049, 42050, 42051, 42052, 42039, 42797, 42798, 42053, 42054, 42790, 42791, 42788, 42792, 42793, 42794, 42795, 42796, 42055, 42056, 42057, 42058, 42059, 0};

  public NoUnderlyingCashSettlTerms() {
    super(42041, 42042, ORDER);
  }

  public void set(quickfix.field.UnderlyingCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlCurrency get(quickfix.field.UnderlyingCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlCurrency getUnderlyingCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlCurrency() {
    return isSetField(42042);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset get(quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset getUnderlyingCashSettlValuationFirstBusinessDayOffset() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationFirstBusinessDayOffset() {
    return isSetField(42043);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset get(quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset getUnderlyingCashSettlValuationSubsequentBusinessDaysOffset() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationSubsequentBusinessDaysOffset() {
    return isSetField(42044);
  }

  public void set(quickfix.field.UnderlyingCashSettlNumOfValuationDates value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlNumOfValuationDates get(quickfix.field.UnderlyingCashSettlNumOfValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlNumOfValuationDates getUnderlyingCashSettlNumOfValuationDates() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlNumOfValuationDates());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlNumOfValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlNumOfValuationDates() {
    return isSetField(42045);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationTime get(quickfix.field.UnderlyingCashSettlValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationTime getUnderlyingCashSettlValuationTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationTime());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationTime() {
    return isSetField(42046);
  }

  public void set(quickfix.field.UnderlyingCashSettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlBusinessCenter get(quickfix.field.UnderlyingCashSettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlBusinessCenter getUnderlyingCashSettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlBusinessCenter() {
    return isSetField(42047);
  }

  public void set(quickfix.field.UnderlyingCashSettlQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlQuoteMethod get(quickfix.field.UnderlyingCashSettlQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlQuoteMethod getUnderlyingCashSettlQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlQuoteMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlQuoteMethod() {
    return isSetField(42048);
  }

  public void set(quickfix.field.UnderlyingCashSettlQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlQuoteAmount get(quickfix.field.UnderlyingCashSettlQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlQuoteAmount getUnderlyingCashSettlQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlQuoteAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlQuoteAmount() {
    return isSetField(42049);
  }

  public void set(quickfix.field.UnderlyingCashSettlQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlQuoteCurrency get(quickfix.field.UnderlyingCashSettlQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlQuoteCurrency getUnderlyingCashSettlQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlQuoteCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlQuoteCurrency() {
    return isSetField(42050);
  }

  public void set(quickfix.field.UnderlyingCashSettlMinimumQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteAmount get(quickfix.field.UnderlyingCashSettlMinimumQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteAmount getUnderlyingCashSettlMinimumQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlMinimumQuoteAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlMinimumQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlMinimumQuoteAmount() {
    return isSetField(42051);
  }

  public void set(quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency get(quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency getUnderlyingCashSettlMinimumQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlMinimumQuoteCurrency() {
    return isSetField(42052);
  }

  public void set(quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp get(quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp getUnderlyingCashSettlDealerGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp());
  }

  public void set(quickfix.field.NoUnderlyingCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingCashSettlDealers get(quickfix.field.NoUnderlyingCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingCashSettlDealers getNoUnderlyingCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingCashSettlDealers() {
    return isSetField(42039);
  }

public static class NoUnderlyingCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42040, 0};

  public NoUnderlyingCashSettlDealers() {
    super(42039, 42040, ORDER);
  }

  public void set(quickfix.field.UnderlyingCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDealer get(quickfix.field.UnderlyingCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDealer getUnderlyingCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDealer());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDealer() {
    return isSetField(42040);
  }
}

  public void set(quickfix.field.UnderlyingCashSettlPriceSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlPriceSource get(quickfix.field.UnderlyingCashSettlPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlPriceSource getUnderlyingCashSettlPriceSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlPriceSource());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlPriceSource() {
    return isSetField(42797);
  }

  public void set(quickfix.field.UnderlyingCashSettlPriceDefault value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlPriceDefault get(quickfix.field.UnderlyingCashSettlPriceDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlPriceDefault getUnderlyingCashSettlPriceDefault() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlPriceDefault());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlPriceDefault field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlPriceDefault() {
    return isSetField(42798);
  }

  public void set(quickfix.field.UnderlyingCashSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlBusinessDays get(quickfix.field.UnderlyingCashSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlBusinessDays getUnderlyingCashSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlBusinessDays() {
    return isSetField(42053);
  }

  public void set(quickfix.field.UnderlyingCashSettlAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlAmount get(quickfix.field.UnderlyingCashSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlAmount getUnderlyingCashSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlAmount() {
    return isSetField(42054);
  }

  public void set(quickfix.fixlatest.component.UnderlyingCashSettlDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDate get(quickfix.fixlatest.component.UnderlyingCashSettlDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDate getUnderlyingCashSettlDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingCashSettlDate());
  }

  public void set(quickfix.field.UnderlyingCashSettlRecoveryFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlRecoveryFactor get(quickfix.field.UnderlyingCashSettlRecoveryFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlRecoveryFactor getUnderlyingCashSettlRecoveryFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlRecoveryFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlRecoveryFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlRecoveryFactor() {
    return isSetField(42055);
  }

  public void set(quickfix.field.UnderlyingCashSettlFixedTermIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlFixedTermIndicator get(quickfix.field.UnderlyingCashSettlFixedTermIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlFixedTermIndicator getUnderlyingCashSettlFixedTermIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlFixedTermIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlFixedTermIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlFixedTermIndicator() {
    return isSetField(42056);
  }

  public void set(quickfix.field.UnderlyingCashSettlAccruedInterestIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlAccruedInterestIndicator get(quickfix.field.UnderlyingCashSettlAccruedInterestIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlAccruedInterestIndicator getUnderlyingCashSettlAccruedInterestIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlAccruedInterestIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlAccruedInterestIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlAccruedInterestIndicator() {
    return isSetField(42057);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationMethod get(quickfix.field.UnderlyingCashSettlValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationMethod getUnderlyingCashSettlValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationMethod() {
    return isSetField(42058);
  }

  public void set(quickfix.field.UnderlyingCashSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlTermXID get(quickfix.field.UnderlyingCashSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlTermXID getUnderlyingCashSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlTermXID());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlTermXID() {
    return isSetField(42059);
  }
}

  public void set(quickfix.field.UnderlyingCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlCurrency get(quickfix.field.UnderlyingCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlCurrency getUnderlyingCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlCurrency() {
    return isSetField(42042);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset get(quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset getUnderlyingCashSettlValuationFirstBusinessDayOffset() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationFirstBusinessDayOffset field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationFirstBusinessDayOffset() {
    return isSetField(42043);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset get(quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset getUnderlyingCashSettlValuationSubsequentBusinessDaysOffset() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationSubsequentBusinessDaysOffset field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationSubsequentBusinessDaysOffset() {
    return isSetField(42044);
  }

  public void set(quickfix.field.UnderlyingCashSettlNumOfValuationDates value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlNumOfValuationDates get(quickfix.field.UnderlyingCashSettlNumOfValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlNumOfValuationDates getUnderlyingCashSettlNumOfValuationDates() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlNumOfValuationDates());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlNumOfValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlNumOfValuationDates() {
    return isSetField(42045);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationTime get(quickfix.field.UnderlyingCashSettlValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationTime getUnderlyingCashSettlValuationTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationTime());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationTime() {
    return isSetField(42046);
  }

  public void set(quickfix.field.UnderlyingCashSettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlBusinessCenter get(quickfix.field.UnderlyingCashSettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlBusinessCenter getUnderlyingCashSettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlBusinessCenter() {
    return isSetField(42047);
  }

  public void set(quickfix.field.UnderlyingCashSettlQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlQuoteMethod get(quickfix.field.UnderlyingCashSettlQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlQuoteMethod getUnderlyingCashSettlQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlQuoteMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlQuoteMethod() {
    return isSetField(42048);
  }

  public void set(quickfix.field.UnderlyingCashSettlQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlQuoteAmount get(quickfix.field.UnderlyingCashSettlQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlQuoteAmount getUnderlyingCashSettlQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlQuoteAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlQuoteAmount() {
    return isSetField(42049);
  }

  public void set(quickfix.field.UnderlyingCashSettlQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlQuoteCurrency get(quickfix.field.UnderlyingCashSettlQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlQuoteCurrency getUnderlyingCashSettlQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlQuoteCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlQuoteCurrency() {
    return isSetField(42050);
  }

  public void set(quickfix.field.UnderlyingCashSettlMinimumQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteAmount get(quickfix.field.UnderlyingCashSettlMinimumQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteAmount getUnderlyingCashSettlMinimumQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlMinimumQuoteAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlMinimumQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlMinimumQuoteAmount() {
    return isSetField(42051);
  }

  public void set(quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency get(quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency getUnderlyingCashSettlMinimumQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlMinimumQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlMinimumQuoteCurrency() {
    return isSetField(42052);
  }

  public void set(quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp get(quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp getUnderlyingCashSettlDealerGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingCashSettlDealerGrp());
  }

  public void set(quickfix.field.NoUnderlyingCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingCashSettlDealers get(quickfix.field.NoUnderlyingCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingCashSettlDealers getNoUnderlyingCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingCashSettlDealers() {
    return isSetField(42039);
  }

public static class NoUnderlyingCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42040, 0};

  public NoUnderlyingCashSettlDealers() {
    super(42039, 42040, ORDER);
  }

  public void set(quickfix.field.UnderlyingCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDealer get(quickfix.field.UnderlyingCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDealer getUnderlyingCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDealer());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDealer() {
    return isSetField(42040);
  }
}

  public void set(quickfix.field.UnderlyingCashSettlPriceSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlPriceSource get(quickfix.field.UnderlyingCashSettlPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlPriceSource getUnderlyingCashSettlPriceSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlPriceSource());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlPriceSource() {
    return isSetField(42797);
  }

  public void set(quickfix.field.UnderlyingCashSettlPriceDefault value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlPriceDefault get(quickfix.field.UnderlyingCashSettlPriceDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlPriceDefault getUnderlyingCashSettlPriceDefault() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlPriceDefault());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlPriceDefault field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlPriceDefault() {
    return isSetField(42798);
  }

  public void set(quickfix.field.UnderlyingCashSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlBusinessDays get(quickfix.field.UnderlyingCashSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlBusinessDays getUnderlyingCashSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlBusinessDays() {
    return isSetField(42053);
  }

  public void set(quickfix.field.UnderlyingCashSettlAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlAmount get(quickfix.field.UnderlyingCashSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlAmount getUnderlyingCashSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlAmount() {
    return isSetField(42054);
  }

  public void set(quickfix.fixlatest.component.UnderlyingCashSettlDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDate get(quickfix.fixlatest.component.UnderlyingCashSettlDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingCashSettlDate getUnderlyingCashSettlDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingCashSettlDate());
  }

  public void set(quickfix.field.UnderlyingCashSettlRecoveryFactor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlRecoveryFactor get(quickfix.field.UnderlyingCashSettlRecoveryFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlRecoveryFactor getUnderlyingCashSettlRecoveryFactor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlRecoveryFactor());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlRecoveryFactor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlRecoveryFactor() {
    return isSetField(42055);
  }

  public void set(quickfix.field.UnderlyingCashSettlFixedTermIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlFixedTermIndicator get(quickfix.field.UnderlyingCashSettlFixedTermIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlFixedTermIndicator getUnderlyingCashSettlFixedTermIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlFixedTermIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlFixedTermIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlFixedTermIndicator() {
    return isSetField(42056);
  }

  public void set(quickfix.field.UnderlyingCashSettlAccruedInterestIndicator value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlAccruedInterestIndicator get(quickfix.field.UnderlyingCashSettlAccruedInterestIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlAccruedInterestIndicator getUnderlyingCashSettlAccruedInterestIndicator() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlAccruedInterestIndicator());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlAccruedInterestIndicator field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlAccruedInterestIndicator() {
    return isSetField(42057);
  }

  public void set(quickfix.field.UnderlyingCashSettlValuationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlValuationMethod get(quickfix.field.UnderlyingCashSettlValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlValuationMethod getUnderlyingCashSettlValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlValuationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlValuationMethod() {
    return isSetField(42058);
  }

  public void set(quickfix.field.UnderlyingCashSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlTermXID get(quickfix.field.UnderlyingCashSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlTermXID getUnderlyingCashSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlTermXID());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlTermXID() {
    return isSetField(42059);
  }
}
