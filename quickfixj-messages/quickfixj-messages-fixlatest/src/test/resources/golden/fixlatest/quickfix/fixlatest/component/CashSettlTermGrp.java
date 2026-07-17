/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class CashSettlTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40022, };
  protected int[] getGroupFields() { return componentGroups; }

  public CashSettlTermGrp() {
    super();
  }

  public void set(quickfix.field.NoCashSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoCashSettlTerms get(quickfix.field.NoCashSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCashSettlTerms getNoCashSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoCashSettlTerms());
  }

  public boolean isSet(quickfix.field.NoCashSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoCashSettlTerms() {
    return isSetField(40022);
  }

public static class NoCashSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40023, 40024, 40916, 40917, 40025, 40026, 40027, 40028, 40029, 40030, 40031, 40277, 42216, 42217, 40033, 40034, 42207, 42208, 42214, 42209, 42210, 42211, 42212, 42213, 40035, 40036, 40037, 40038, 40039, 0};

  public NoCashSettlTerms() {
    super(40022, 40023, ORDER);
  }

  public void set(quickfix.field.CashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.CashSettlCurrency get(quickfix.field.CashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlCurrency getCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.CashSettlCurrency());
  }

  public boolean isSet(quickfix.field.CashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlCurrency() {
    return isSetField(40023);
  }

  public void set(quickfix.field.CashSettlValuationFirstBusinessDayOffset value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationFirstBusinessDayOffset get(quickfix.field.CashSettlValuationFirstBusinessDayOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationFirstBusinessDayOffset getCashSettlValuationFirstBusinessDayOffset() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationFirstBusinessDayOffset());
  }

  public boolean isSet(quickfix.field.CashSettlValuationFirstBusinessDayOffset field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationFirstBusinessDayOffset() {
    return isSetField(40024);
  }

  public void set(quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset get(quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset getCashSettlValuationSubsequentBusinessDaysOffset() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset());
  }

  public boolean isSet(quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationSubsequentBusinessDaysOffset() {
    return isSetField(40916);
  }

  public void set(quickfix.field.CashSettlNumOfValuationDates value) {
    setField(value);
  }

  public quickfix.field.CashSettlNumOfValuationDates get(quickfix.field.CashSettlNumOfValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlNumOfValuationDates getCashSettlNumOfValuationDates() throws FieldNotFound {
    return get(new quickfix.field.CashSettlNumOfValuationDates());
  }

  public boolean isSet(quickfix.field.CashSettlNumOfValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlNumOfValuationDates() {
    return isSetField(40917);
  }

  public void set(quickfix.field.CashSettlValuationTime value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationTime get(quickfix.field.CashSettlValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationTime getCashSettlValuationTime() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationTime());
  }

  public boolean isSet(quickfix.field.CashSettlValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationTime() {
    return isSetField(40025);
  }

  public void set(quickfix.field.CashSettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.CashSettlBusinessCenter get(quickfix.field.CashSettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlBusinessCenter getCashSettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.CashSettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.CashSettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlBusinessCenter() {
    return isSetField(40026);
  }

  public void set(quickfix.field.CashSettlQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.CashSettlQuoteMethod get(quickfix.field.CashSettlQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlQuoteMethod getCashSettlQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.CashSettlQuoteMethod());
  }

  public boolean isSet(quickfix.field.CashSettlQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlQuoteMethod() {
    return isSetField(40027);
  }

  public void set(quickfix.field.CashSettlQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.CashSettlQuoteAmount get(quickfix.field.CashSettlQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlQuoteAmount getCashSettlQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.CashSettlQuoteAmount());
  }

  public boolean isSet(quickfix.field.CashSettlQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlQuoteAmount() {
    return isSetField(40028);
  }

  public void set(quickfix.field.CashSettlQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.CashSettlQuoteCurrency get(quickfix.field.CashSettlQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlQuoteCurrency getCashSettlQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.CashSettlQuoteCurrency());
  }

  public boolean isSet(quickfix.field.CashSettlQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlQuoteCurrency() {
    return isSetField(40029);
  }

  public void set(quickfix.field.CashSettlMinimumQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.CashSettlMinimumQuoteAmount get(quickfix.field.CashSettlMinimumQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlMinimumQuoteAmount getCashSettlMinimumQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.CashSettlMinimumQuoteAmount());
  }

  public boolean isSet(quickfix.field.CashSettlMinimumQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlMinimumQuoteAmount() {
    return isSetField(40030);
  }

  public void set(quickfix.field.CashSettlMinimumQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.CashSettlMinimumQuoteCurrency get(quickfix.field.CashSettlMinimumQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlMinimumQuoteCurrency getCashSettlMinimumQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.CashSettlMinimumQuoteCurrency());
  }

  public boolean isSet(quickfix.field.CashSettlMinimumQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlMinimumQuoteCurrency() {
    return isSetField(40031);
  }

  public void set(quickfix.fixlatest.component.CashSettlDealerGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CashSettlDealerGrp get(quickfix.fixlatest.component.CashSettlDealerGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CashSettlDealerGrp getCashSettlDealerGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CashSettlDealerGrp());
  }

  public void set(quickfix.field.NoCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoCashSettlDealers get(quickfix.field.NoCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCashSettlDealers getNoCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoCashSettlDealers() {
    return isSetField(40277);
  }

public static class NoCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40032, 0};

  public NoCashSettlDealers() {
    super(40277, 40032, ORDER);
  }

  public void set(quickfix.field.CashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.CashSettlDealer get(quickfix.field.CashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDealer getCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDealer());
  }

  public boolean isSet(quickfix.field.CashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDealer() {
    return isSetField(40032);
  }
}

  public void set(quickfix.field.CashSettlPriceSource value) {
    setField(value);
  }

  public quickfix.field.CashSettlPriceSource get(quickfix.field.CashSettlPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlPriceSource getCashSettlPriceSource() throws FieldNotFound {
    return get(new quickfix.field.CashSettlPriceSource());
  }

  public boolean isSet(quickfix.field.CashSettlPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlPriceSource() {
    return isSetField(42216);
  }

  public void set(quickfix.field.CashSettlPriceDefault value) {
    setField(value);
  }

  public quickfix.field.CashSettlPriceDefault get(quickfix.field.CashSettlPriceDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlPriceDefault getCashSettlPriceDefault() throws FieldNotFound {
    return get(new quickfix.field.CashSettlPriceDefault());
  }

  public boolean isSet(quickfix.field.CashSettlPriceDefault field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlPriceDefault() {
    return isSetField(42217);
  }

  public void set(quickfix.field.CashSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.CashSettlBusinessDays get(quickfix.field.CashSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlBusinessDays getCashSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.CashSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.CashSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlBusinessDays() {
    return isSetField(40033);
  }

  public void set(quickfix.field.CashSettlAmount value) {
    setField(value);
  }

  public quickfix.field.CashSettlAmount get(quickfix.field.CashSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlAmount getCashSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.CashSettlAmount());
  }

  public boolean isSet(quickfix.field.CashSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlAmount() {
    return isSetField(40034);
  }

  public void set(quickfix.fixlatest.component.CashSettlDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CashSettlDate get(quickfix.fixlatest.component.CashSettlDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CashSettlDate getCashSettlDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CashSettlDate());
  }

  public void set(quickfix.field.CashSettlRecoveryFactor value) {
    setField(value);
  }

  public quickfix.field.CashSettlRecoveryFactor get(quickfix.field.CashSettlRecoveryFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlRecoveryFactor getCashSettlRecoveryFactor() throws FieldNotFound {
    return get(new quickfix.field.CashSettlRecoveryFactor());
  }

  public boolean isSet(quickfix.field.CashSettlRecoveryFactor field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlRecoveryFactor() {
    return isSetField(40035);
  }

  public void set(quickfix.field.CashSettlFixedTermIndicator value) {
    setField(value);
  }

  public quickfix.field.CashSettlFixedTermIndicator get(quickfix.field.CashSettlFixedTermIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlFixedTermIndicator getCashSettlFixedTermIndicator() throws FieldNotFound {
    return get(new quickfix.field.CashSettlFixedTermIndicator());
  }

  public boolean isSet(quickfix.field.CashSettlFixedTermIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlFixedTermIndicator() {
    return isSetField(40036);
  }

  public void set(quickfix.field.CashSettlAccruedInterestIndicator value) {
    setField(value);
  }

  public quickfix.field.CashSettlAccruedInterestIndicator get(quickfix.field.CashSettlAccruedInterestIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlAccruedInterestIndicator getCashSettlAccruedInterestIndicator() throws FieldNotFound {
    return get(new quickfix.field.CashSettlAccruedInterestIndicator());
  }

  public boolean isSet(quickfix.field.CashSettlAccruedInterestIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlAccruedInterestIndicator() {
    return isSetField(40037);
  }

  public void set(quickfix.field.CashSettlValuationMethod value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationMethod get(quickfix.field.CashSettlValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationMethod getCashSettlValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationMethod());
  }

  public boolean isSet(quickfix.field.CashSettlValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationMethod() {
    return isSetField(40038);
  }

  public void set(quickfix.field.CashSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.CashSettlTermXID get(quickfix.field.CashSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlTermXID getCashSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.CashSettlTermXID());
  }

  public boolean isSet(quickfix.field.CashSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlTermXID() {
    return isSetField(40039);
  }
}

  public void set(quickfix.field.CashSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.CashSettlCurrency get(quickfix.field.CashSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlCurrency getCashSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.CashSettlCurrency());
  }

  public boolean isSet(quickfix.field.CashSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlCurrency() {
    return isSetField(40023);
  }

  public void set(quickfix.field.CashSettlValuationFirstBusinessDayOffset value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationFirstBusinessDayOffset get(quickfix.field.CashSettlValuationFirstBusinessDayOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationFirstBusinessDayOffset getCashSettlValuationFirstBusinessDayOffset() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationFirstBusinessDayOffset());
  }

  public boolean isSet(quickfix.field.CashSettlValuationFirstBusinessDayOffset field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationFirstBusinessDayOffset() {
    return isSetField(40024);
  }

  public void set(quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset get(quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset getCashSettlValuationSubsequentBusinessDaysOffset() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset());
  }

  public boolean isSet(quickfix.field.CashSettlValuationSubsequentBusinessDaysOffset field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationSubsequentBusinessDaysOffset() {
    return isSetField(40916);
  }

  public void set(quickfix.field.CashSettlNumOfValuationDates value) {
    setField(value);
  }

  public quickfix.field.CashSettlNumOfValuationDates get(quickfix.field.CashSettlNumOfValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlNumOfValuationDates getCashSettlNumOfValuationDates() throws FieldNotFound {
    return get(new quickfix.field.CashSettlNumOfValuationDates());
  }

  public boolean isSet(quickfix.field.CashSettlNumOfValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlNumOfValuationDates() {
    return isSetField(40917);
  }

  public void set(quickfix.field.CashSettlValuationTime value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationTime get(quickfix.field.CashSettlValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationTime getCashSettlValuationTime() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationTime());
  }

  public boolean isSet(quickfix.field.CashSettlValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationTime() {
    return isSetField(40025);
  }

  public void set(quickfix.field.CashSettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.CashSettlBusinessCenter get(quickfix.field.CashSettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlBusinessCenter getCashSettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.CashSettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.CashSettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlBusinessCenter() {
    return isSetField(40026);
  }

  public void set(quickfix.field.CashSettlQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.CashSettlQuoteMethod get(quickfix.field.CashSettlQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlQuoteMethod getCashSettlQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.CashSettlQuoteMethod());
  }

  public boolean isSet(quickfix.field.CashSettlQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlQuoteMethod() {
    return isSetField(40027);
  }

  public void set(quickfix.field.CashSettlQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.CashSettlQuoteAmount get(quickfix.field.CashSettlQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlQuoteAmount getCashSettlQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.CashSettlQuoteAmount());
  }

  public boolean isSet(quickfix.field.CashSettlQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlQuoteAmount() {
    return isSetField(40028);
  }

  public void set(quickfix.field.CashSettlQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.CashSettlQuoteCurrency get(quickfix.field.CashSettlQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlQuoteCurrency getCashSettlQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.CashSettlQuoteCurrency());
  }

  public boolean isSet(quickfix.field.CashSettlQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlQuoteCurrency() {
    return isSetField(40029);
  }

  public void set(quickfix.field.CashSettlMinimumQuoteAmount value) {
    setField(value);
  }

  public quickfix.field.CashSettlMinimumQuoteAmount get(quickfix.field.CashSettlMinimumQuoteAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlMinimumQuoteAmount getCashSettlMinimumQuoteAmount() throws FieldNotFound {
    return get(new quickfix.field.CashSettlMinimumQuoteAmount());
  }

  public boolean isSet(quickfix.field.CashSettlMinimumQuoteAmount field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlMinimumQuoteAmount() {
    return isSetField(40030);
  }

  public void set(quickfix.field.CashSettlMinimumQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.CashSettlMinimumQuoteCurrency get(quickfix.field.CashSettlMinimumQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlMinimumQuoteCurrency getCashSettlMinimumQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.CashSettlMinimumQuoteCurrency());
  }

  public boolean isSet(quickfix.field.CashSettlMinimumQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlMinimumQuoteCurrency() {
    return isSetField(40031);
  }

  public void set(quickfix.fixlatest.component.CashSettlDealerGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CashSettlDealerGrp get(quickfix.fixlatest.component.CashSettlDealerGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CashSettlDealerGrp getCashSettlDealerGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CashSettlDealerGrp());
  }

  public void set(quickfix.field.NoCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoCashSettlDealers get(quickfix.field.NoCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCashSettlDealers getNoCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoCashSettlDealers() {
    return isSetField(40277);
  }

public static class NoCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40032, 0};

  public NoCashSettlDealers() {
    super(40277, 40032, ORDER);
  }

  public void set(quickfix.field.CashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.CashSettlDealer get(quickfix.field.CashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDealer getCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDealer());
  }

  public boolean isSet(quickfix.field.CashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDealer() {
    return isSetField(40032);
  }
}

  public void set(quickfix.field.CashSettlPriceSource value) {
    setField(value);
  }

  public quickfix.field.CashSettlPriceSource get(quickfix.field.CashSettlPriceSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlPriceSource getCashSettlPriceSource() throws FieldNotFound {
    return get(new quickfix.field.CashSettlPriceSource());
  }

  public boolean isSet(quickfix.field.CashSettlPriceSource field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlPriceSource() {
    return isSetField(42216);
  }

  public void set(quickfix.field.CashSettlPriceDefault value) {
    setField(value);
  }

  public quickfix.field.CashSettlPriceDefault get(quickfix.field.CashSettlPriceDefault value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlPriceDefault getCashSettlPriceDefault() throws FieldNotFound {
    return get(new quickfix.field.CashSettlPriceDefault());
  }

  public boolean isSet(quickfix.field.CashSettlPriceDefault field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlPriceDefault() {
    return isSetField(42217);
  }

  public void set(quickfix.field.CashSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.CashSettlBusinessDays get(quickfix.field.CashSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlBusinessDays getCashSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.CashSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.CashSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlBusinessDays() {
    return isSetField(40033);
  }

  public void set(quickfix.field.CashSettlAmount value) {
    setField(value);
  }

  public quickfix.field.CashSettlAmount get(quickfix.field.CashSettlAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlAmount getCashSettlAmount() throws FieldNotFound {
    return get(new quickfix.field.CashSettlAmount());
  }

  public boolean isSet(quickfix.field.CashSettlAmount field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlAmount() {
    return isSetField(40034);
  }

  public void set(quickfix.fixlatest.component.CashSettlDate component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CashSettlDate get(quickfix.fixlatest.component.CashSettlDate component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CashSettlDate getCashSettlDateComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CashSettlDate());
  }

  public void set(quickfix.field.CashSettlRecoveryFactor value) {
    setField(value);
  }

  public quickfix.field.CashSettlRecoveryFactor get(quickfix.field.CashSettlRecoveryFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlRecoveryFactor getCashSettlRecoveryFactor() throws FieldNotFound {
    return get(new quickfix.field.CashSettlRecoveryFactor());
  }

  public boolean isSet(quickfix.field.CashSettlRecoveryFactor field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlRecoveryFactor() {
    return isSetField(40035);
  }

  public void set(quickfix.field.CashSettlFixedTermIndicator value) {
    setField(value);
  }

  public quickfix.field.CashSettlFixedTermIndicator get(quickfix.field.CashSettlFixedTermIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlFixedTermIndicator getCashSettlFixedTermIndicator() throws FieldNotFound {
    return get(new quickfix.field.CashSettlFixedTermIndicator());
  }

  public boolean isSet(quickfix.field.CashSettlFixedTermIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlFixedTermIndicator() {
    return isSetField(40036);
  }

  public void set(quickfix.field.CashSettlAccruedInterestIndicator value) {
    setField(value);
  }

  public quickfix.field.CashSettlAccruedInterestIndicator get(quickfix.field.CashSettlAccruedInterestIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlAccruedInterestIndicator getCashSettlAccruedInterestIndicator() throws FieldNotFound {
    return get(new quickfix.field.CashSettlAccruedInterestIndicator());
  }

  public boolean isSet(quickfix.field.CashSettlAccruedInterestIndicator field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlAccruedInterestIndicator() {
    return isSetField(40037);
  }

  public void set(quickfix.field.CashSettlValuationMethod value) {
    setField(value);
  }

  public quickfix.field.CashSettlValuationMethod get(quickfix.field.CashSettlValuationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlValuationMethod getCashSettlValuationMethod() throws FieldNotFound {
    return get(new quickfix.field.CashSettlValuationMethod());
  }

  public boolean isSet(quickfix.field.CashSettlValuationMethod field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlValuationMethod() {
    return isSetField(40038);
  }

  public void set(quickfix.field.CashSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.CashSettlTermXID get(quickfix.field.CashSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlTermXID getCashSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.CashSettlTermXID());
  }

  public boolean isSet(quickfix.field.CashSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlTermXID() {
    return isSetField(40039);
  }
}
