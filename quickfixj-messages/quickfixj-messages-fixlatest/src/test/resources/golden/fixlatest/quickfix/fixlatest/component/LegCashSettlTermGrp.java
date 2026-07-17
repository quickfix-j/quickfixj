/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegCashSettlTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41344, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegCashSettlTermGrp() {
    super();
  }

  public void set(quickfix.field.NoLegCashSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoLegCashSettlTerms get(quickfix.field.NoLegCashSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegCashSettlTerms getNoLegCashSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoLegCashSettlTerms());
  }

  public boolean isSet(quickfix.field.NoLegCashSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoLegCashSettlTerms() {
    return isSetField(41344);
  }

public static class NoLegCashSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41345, 41346, 41347, 41348, 41349, 41350, 41351, 41352, 41353, 41354, 41355, 41342, 42308, 42309, 41356, 41357, 42299, 42300, 42306, 42301, 42302, 42303, 42304, 42305, 41358, 41359, 41360, 41361, 41362, 0};

  public NoLegCashSettlTerms() {
    super(41344, 41345, ORDER);
  }

  public void set(quickfix.field.LegCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlCurrency get(quickfix.field.LegCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlCurrency getLegCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlCurrency() {
    return isSetField(41345);
  }

  public void set(quickfix.field.LegCasSettlValuationFirstBusinessDayOffset value) {
    setField(value);
  }

  public quickfix.field.LegCasSettlValuationFirstBusinessDayOffset get(quickfix.field.LegCasSettlValuationFirstBusinessDayOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCasSettlValuationFirstBusinessDayOffset getLegCasSettlValuationFirstBusinessDayOffset() throws FieldNotFound {
    return get(new quickfix.field.LegCasSettlValuationFirstBusinessDayOffset());
  }

  public boolean isSet(quickfix.field.LegCasSettlValuationFirstBusinessDayOffset field) {
    return isSetField(field);
  }

  public boolean isSetLegCasSettlValuationFirstBusinessDayOffset() {
    return isSetField(41346);
  }

  public void set(quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset get(quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset getLegCashSettlValuationSubsequentBusinessDaysOffset() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset());
  }

  public boolean isSet(quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlValuationSubsequentBusinessDaysOffset() {
    return isSetField(41347);
  }

  public void set(quickfix.field.LegCashSettlNumOfValuationDates value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlNumOfValuationDates get(quickfix.field.LegCashSettlNumOfValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlNumOfValuationDates getLegCashSettlNumOfValuationDates() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlNumOfValuationDates());
  }

  public boolean isSet(quickfix.field.LegCashSettlNumOfValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlNumOfValuationDates() {
    return isSetField(41348);
  }

  public void set(quickfix.field.LegCashSettlValuationTime value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlValuationTime get(quickfix.field.LegCashSettlValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlValuationTime getLegCashSettlValuationTime() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlValuationTime());
  }

  public boolean isSet(quickfix.field.LegCashSettlValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlValuationTime() {
    return isSetField(41349);
  }

  public void set(quickfix.field.LegCashSettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlBusinessCenter get(quickfix.field.LegCashSettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlBusinessCenter getLegCashSettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegCashSettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlBusinessCenter() {
    return isSetField(41350);
  }

  public void set(quickfix.field.LegCashSettlQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlQuoteMethod get(quickfix.field.LegCashSettlQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlQuoteMethod getLegCashSettlQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlQuoteMethod());
  }

  public boolean isSet(quickfix.field.LegCashSettlQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlQuoteMethod() {
    return isSetField(41351);
  }

  public void set(quickfix.field.LegCashSettlQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlQuoteAmount get(quickfix.field.LegCashSettlQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlQuoteAmount getLegCashSettlQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlQuoteAmount());
  }

  public boolean isSet(quickfix.field.LegCashSettlQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlQuoteAmount() {
    return isSetField(41352);
  }

  public void set(quickfix.field.LegCashSettlQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlQuoteCurrency get(quickfix.field.LegCashSettlQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlQuoteCurrency getLegCashSettlQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlQuoteCurrency());
  }

  public boolean isSet(quickfix.field.LegCashSettlQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlQuoteCurrency() {
    return isSetField(41353);
  }

  public void set(quickfix.field.LegCashSettlMinimumQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlMinimumQuoteAmount get(quickfix.field.LegCashSettlMinimumQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlMinimumQuoteAmount getLegCashSettlMinimumQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlMinimumQuoteAmount());
  }

  public boolean isSet(quickfix.field.LegCashSettlMinimumQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlMinimumQuoteAmount() {
    return isSetField(41354);
  }

  public void set(quickfix.field.LegCashSettlMinimumQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlMinimumQuoteCurrency get(quickfix.field.LegCashSettlMinimumQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlMinimumQuoteCurrency getLegCashSettlMinimumQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlMinimumQuoteCurrency());
  }

  public boolean isSet(quickfix.field.LegCashSettlMinimumQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlMinimumQuoteCurrency() {
    return isSetField(41355);
  }

  public void set(quickfix.fixlatest.component.LegCashSettlDealerGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegCashSettlDealerGrp get(quickfix.fixlatest.component.LegCashSettlDealerGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegCashSettlDealerGrp getLegCashSettlDealerGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegCashSettlDealerGrp());
  }

  public void set(quickfix.field.NoLegCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoLegCashSettlDealers get(quickfix.field.NoLegCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegCashSettlDealers getNoLegCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoLegCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoLegCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegCashSettlDealers() {
    return isSetField(41342);
  }

public static class NoLegCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41343, 0};

  public NoLegCashSettlDealers() {
    super(41342, 41343, ORDER);
  }

  public void set(quickfix.field.LegCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDealer get(quickfix.field.LegCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDealer getLegCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDealer());
  }

  public boolean isSet(quickfix.field.LegCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDealer() {
    return isSetField(41343);
  }
}

  public void set(quickfix.field.LegCashSettlPriceSource value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlPriceSource get(quickfix.field.LegCashSettlPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlPriceSource getLegCashSettlPriceSource() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlPriceSource());
  }

  public boolean isSet(quickfix.field.LegCashSettlPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlPriceSource() {
    return isSetField(42308);
  }

  public void set(quickfix.field.LegCashSettlPriceDefault value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlPriceDefault get(quickfix.field.LegCashSettlPriceDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlPriceDefault getLegCashSettlPriceDefault() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlPriceDefault());
  }

  public boolean isSet(quickfix.field.LegCashSettlPriceDefault field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlPriceDefault() {
    return isSetField(42309);
  }

  public void set(quickfix.field.LegCashSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlBusinessDays get(quickfix.field.LegCashSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlBusinessDays getLegCashSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.LegCashSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlBusinessDays() {
    return isSetField(41356);
  }

  public void set(quickfix.field.LegCashSettlAmount value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlAmount get(quickfix.field.LegCashSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlAmount getLegCashSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlAmount());
  }

  public boolean isSet(quickfix.field.LegCashSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlAmount() {
    return isSetField(41357);
  }

  public void set(quickfix.fixlatest.component.LegCashSettlDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegCashSettlDate get(quickfix.fixlatest.component.LegCashSettlDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegCashSettlDate getLegCashSettlDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegCashSettlDate());
  }

  public void set(quickfix.field.LegCashSettlRecoveryFactor value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlRecoveryFactor get(quickfix.field.LegCashSettlRecoveryFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlRecoveryFactor getLegCashSettlRecoveryFactor() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlRecoveryFactor());
  }

  public boolean isSet(quickfix.field.LegCashSettlRecoveryFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlRecoveryFactor() {
    return isSetField(41358);
  }

  public void set(quickfix.field.LegCashSettlFixedTermIndicator value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlFixedTermIndicator get(quickfix.field.LegCashSettlFixedTermIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlFixedTermIndicator getLegCashSettlFixedTermIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlFixedTermIndicator());
  }

  public boolean isSet(quickfix.field.LegCashSettlFixedTermIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlFixedTermIndicator() {
    return isSetField(41359);
  }

  public void set(quickfix.field.LegCashSettlAccruedInterestIndicator value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlAccruedInterestIndicator get(quickfix.field.LegCashSettlAccruedInterestIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlAccruedInterestIndicator getLegCashSettlAccruedInterestIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlAccruedInterestIndicator());
  }

  public boolean isSet(quickfix.field.LegCashSettlAccruedInterestIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlAccruedInterestIndicator() {
    return isSetField(41360);
  }

  public void set(quickfix.field.LegCashSettlValuationMethod value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlValuationMethod get(quickfix.field.LegCashSettlValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlValuationMethod getLegCashSettlValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlValuationMethod());
  }

  public boolean isSet(quickfix.field.LegCashSettlValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlValuationMethod() {
    return isSetField(41361);
  }

  public void set(quickfix.field.LegCashSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlTermXID get(quickfix.field.LegCashSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlTermXID getLegCashSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlTermXID());
  }

  public boolean isSet(quickfix.field.LegCashSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlTermXID() {
    return isSetField(41362);
  }
}

  public void set(quickfix.field.LegCashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlCurrency get(quickfix.field.LegCashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlCurrency getLegCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlCurrency());
  }

  public boolean isSet(quickfix.field.LegCashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlCurrency() {
    return isSetField(41345);
  }

  public void set(quickfix.field.LegCasSettlValuationFirstBusinessDayOffset value) {
    setField(value);
  }

  public quickfix.field.LegCasSettlValuationFirstBusinessDayOffset get(quickfix.field.LegCasSettlValuationFirstBusinessDayOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCasSettlValuationFirstBusinessDayOffset getLegCasSettlValuationFirstBusinessDayOffset() throws FieldNotFound {
    return get(new quickfix.field.LegCasSettlValuationFirstBusinessDayOffset());
  }

  public boolean isSet(quickfix.field.LegCasSettlValuationFirstBusinessDayOffset field) {
    return isSetField(field);
  }

  public boolean isSetLegCasSettlValuationFirstBusinessDayOffset() {
    return isSetField(41346);
  }

  public void set(quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset get(quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset getLegCashSettlValuationSubsequentBusinessDaysOffset() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset());
  }

  public boolean isSet(quickfix.field.LegCashSettlValuationSubsequentBusinessDaysOffset field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlValuationSubsequentBusinessDaysOffset() {
    return isSetField(41347);
  }

  public void set(quickfix.field.LegCashSettlNumOfValuationDates value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlNumOfValuationDates get(quickfix.field.LegCashSettlNumOfValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlNumOfValuationDates getLegCashSettlNumOfValuationDates() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlNumOfValuationDates());
  }

  public boolean isSet(quickfix.field.LegCashSettlNumOfValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlNumOfValuationDates() {
    return isSetField(41348);
  }

  public void set(quickfix.field.LegCashSettlValuationTime value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlValuationTime get(quickfix.field.LegCashSettlValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlValuationTime getLegCashSettlValuationTime() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlValuationTime());
  }

  public boolean isSet(quickfix.field.LegCashSettlValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlValuationTime() {
    return isSetField(41349);
  }

  public void set(quickfix.field.LegCashSettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlBusinessCenter get(quickfix.field.LegCashSettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlBusinessCenter getLegCashSettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegCashSettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlBusinessCenter() {
    return isSetField(41350);
  }

  public void set(quickfix.field.LegCashSettlQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlQuoteMethod get(quickfix.field.LegCashSettlQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlQuoteMethod getLegCashSettlQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlQuoteMethod());
  }

  public boolean isSet(quickfix.field.LegCashSettlQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlQuoteMethod() {
    return isSetField(41351);
  }

  public void set(quickfix.field.LegCashSettlQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlQuoteAmount get(quickfix.field.LegCashSettlQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlQuoteAmount getLegCashSettlQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlQuoteAmount());
  }

  public boolean isSet(quickfix.field.LegCashSettlQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlQuoteAmount() {
    return isSetField(41352);
  }

  public void set(quickfix.field.LegCashSettlQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlQuoteCurrency get(quickfix.field.LegCashSettlQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlQuoteCurrency getLegCashSettlQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlQuoteCurrency());
  }

  public boolean isSet(quickfix.field.LegCashSettlQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlQuoteCurrency() {
    return isSetField(41353);
  }

  public void set(quickfix.field.LegCashSettlMinimumQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlMinimumQuoteAmount get(quickfix.field.LegCashSettlMinimumQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlMinimumQuoteAmount getLegCashSettlMinimumQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlMinimumQuoteAmount());
  }

  public boolean isSet(quickfix.field.LegCashSettlMinimumQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlMinimumQuoteAmount() {
    return isSetField(41354);
  }

  public void set(quickfix.field.LegCashSettlMinimumQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlMinimumQuoteCurrency get(quickfix.field.LegCashSettlMinimumQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlMinimumQuoteCurrency getLegCashSettlMinimumQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlMinimumQuoteCurrency());
  }

  public boolean isSet(quickfix.field.LegCashSettlMinimumQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlMinimumQuoteCurrency() {
    return isSetField(41355);
  }

  public void set(quickfix.fixlatest.component.LegCashSettlDealerGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegCashSettlDealerGrp get(quickfix.fixlatest.component.LegCashSettlDealerGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegCashSettlDealerGrp getLegCashSettlDealerGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegCashSettlDealerGrp());
  }

  public void set(quickfix.field.NoLegCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoLegCashSettlDealers get(quickfix.field.NoLegCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegCashSettlDealers getNoLegCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoLegCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoLegCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegCashSettlDealers() {
    return isSetField(41342);
  }

public static class NoLegCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41343, 0};

  public NoLegCashSettlDealers() {
    super(41342, 41343, ORDER);
  }

  public void set(quickfix.field.LegCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDealer get(quickfix.field.LegCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDealer getLegCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDealer());
  }

  public boolean isSet(quickfix.field.LegCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDealer() {
    return isSetField(41343);
  }
}

  public void set(quickfix.field.LegCashSettlPriceSource value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlPriceSource get(quickfix.field.LegCashSettlPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlPriceSource getLegCashSettlPriceSource() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlPriceSource());
  }

  public boolean isSet(quickfix.field.LegCashSettlPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlPriceSource() {
    return isSetField(42308);
  }

  public void set(quickfix.field.LegCashSettlPriceDefault value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlPriceDefault get(quickfix.field.LegCashSettlPriceDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlPriceDefault getLegCashSettlPriceDefault() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlPriceDefault());
  }

  public boolean isSet(quickfix.field.LegCashSettlPriceDefault field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlPriceDefault() {
    return isSetField(42309);
  }

  public void set(quickfix.field.LegCashSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlBusinessDays get(quickfix.field.LegCashSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlBusinessDays getLegCashSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.LegCashSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlBusinessDays() {
    return isSetField(41356);
  }

  public void set(quickfix.field.LegCashSettlAmount value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlAmount get(quickfix.field.LegCashSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlAmount getLegCashSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlAmount());
  }

  public boolean isSet(quickfix.field.LegCashSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlAmount() {
    return isSetField(41357);
  }

  public void set(quickfix.fixlatest.component.LegCashSettlDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegCashSettlDate get(quickfix.fixlatest.component.LegCashSettlDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegCashSettlDate getLegCashSettlDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegCashSettlDate());
  }

  public void set(quickfix.field.LegCashSettlRecoveryFactor value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlRecoveryFactor get(quickfix.field.LegCashSettlRecoveryFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlRecoveryFactor getLegCashSettlRecoveryFactor() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlRecoveryFactor());
  }

  public boolean isSet(quickfix.field.LegCashSettlRecoveryFactor field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlRecoveryFactor() {
    return isSetField(41358);
  }

  public void set(quickfix.field.LegCashSettlFixedTermIndicator value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlFixedTermIndicator get(quickfix.field.LegCashSettlFixedTermIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlFixedTermIndicator getLegCashSettlFixedTermIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlFixedTermIndicator());
  }

  public boolean isSet(quickfix.field.LegCashSettlFixedTermIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlFixedTermIndicator() {
    return isSetField(41359);
  }

  public void set(quickfix.field.LegCashSettlAccruedInterestIndicator value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlAccruedInterestIndicator get(quickfix.field.LegCashSettlAccruedInterestIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlAccruedInterestIndicator getLegCashSettlAccruedInterestIndicator() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlAccruedInterestIndicator());
  }

  public boolean isSet(quickfix.field.LegCashSettlAccruedInterestIndicator field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlAccruedInterestIndicator() {
    return isSetField(41360);
  }

  public void set(quickfix.field.LegCashSettlValuationMethod value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlValuationMethod get(quickfix.field.LegCashSettlValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlValuationMethod getLegCashSettlValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlValuationMethod());
  }

  public boolean isSet(quickfix.field.LegCashSettlValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlValuationMethod() {
    return isSetField(41361);
  }

  public void set(quickfix.field.LegCashSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlTermXID get(quickfix.field.LegCashSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlTermXID getLegCashSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlTermXID());
  }

  public boolean isSet(quickfix.field.LegCashSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlTermXID() {
    return isSetField(41362);
  }
}
