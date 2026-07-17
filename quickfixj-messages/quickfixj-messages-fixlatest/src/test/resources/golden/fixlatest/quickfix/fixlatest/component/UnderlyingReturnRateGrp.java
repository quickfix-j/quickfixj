/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingReturnRateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43034, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingReturnRateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingReturnRates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRates get(quickfix.field.NoUnderlyingReturnRates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRates getNoUnderlyingReturnRates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRates() {
    return isSetField(43034);
  }

public static class NoUnderlyingReturnRates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43035, 43036, 43037, 43038, 43039, 43040, 43064, 43030, 43041, 43042, 43043, 43044, 43045, 43046, 43047, 43048, 43049, 43050, 43051, 43052, 43060, 43053, 43054, 43008, 43055, 43056, 43057, 43058, 43059, 0};

  public NoUnderlyingReturnRates() {
    super(43034, 43035, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceSequence value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceSequence get(quickfix.field.UnderlyingReturnRatePriceSequence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceSequence getUnderlyingReturnRatePriceSequence() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceSequence());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceSequence field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceSequence() {
    return isSetField(43035);
  }

  public void set(quickfix.field.UnderlyingReturnRateCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateCommissionBasis get(quickfix.field.UnderlyingReturnRateCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateCommissionBasis getUnderlyingReturnRateCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateCommissionBasis());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateCommissionBasis() {
    return isSetField(43036);
  }

  public void set(quickfix.field.UnderlyingReturnRateCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateCommissionAmount get(quickfix.field.UnderlyingReturnRateCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateCommissionAmount getUnderlyingReturnRateCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateCommissionAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateCommissionAmount() {
    return isSetField(43037);
  }

  public void set(quickfix.field.UnderlyingReturnRateCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateCommissionCurrency get(quickfix.field.UnderlyingReturnRateCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateCommissionCurrency getUnderlyingReturnRateCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateCommissionCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateCommissionCurrency() {
    return isSetField(43038);
  }

  public void set(quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade get(quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade getUnderlyingReturnRateTotalCommissionPerTrade() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateTotalCommissionPerTrade() {
    return isSetField(43039);
  }

  public void set(quickfix.field.UnderlyingReturnRateDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateDeterminationMethod get(quickfix.field.UnderlyingReturnRateDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateDeterminationMethod getUnderlyingReturnRateDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateDeterminationMethod() {
    return isSetField(43040);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp get(quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp getUnderlyingReturnRatePriceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRatePrices value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRatePrices get(quickfix.field.NoUnderlyingReturnRatePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRatePrices getNoUnderlyingReturnRatePrices() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRatePrices());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRatePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRatePrices() {
    return isSetField(43064);
  }

public static class NoUnderlyingReturnRatePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43065, 43066, 43067, 43068, 0};

  public NoUnderlyingReturnRatePrices() {
    super(43064, 43065, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceBasis get(quickfix.field.UnderlyingReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceBasis getUnderlyingReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceBasis() {
    return isSetField(43065);
  }

  public void set(quickfix.field.UnderlyingReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePrice get(quickfix.field.UnderlyingReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePrice getUnderlyingReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePrice() {
    return isSetField(43066);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceCurrency get(quickfix.field.UnderlyingReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceCurrency getUnderlyingReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceCurrency() {
    return isSetField(43067);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceType get(quickfix.field.UnderlyingReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceType getUnderlyingReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceType() {
    return isSetField(43068);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp get(quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp getUnderlyingReturnRateFXConversionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateFXConversions value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateFXConversions get(quickfix.field.NoUnderlyingReturnRateFXConversions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateFXConversions getNoUnderlyingReturnRateFXConversions() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateFXConversions());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateFXConversions field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateFXConversions() {
    return isSetField(43030);
  }

public static class NoUnderlyingReturnRateFXConversions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43031, 43032, 43033, 0};

  public NoUnderlyingReturnRateFXConversions() {
    super(43030, 43031, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXCurrencySymbol get(quickfix.field.UnderlyingReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXCurrencySymbol getUnderlyingReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXCurrencySymbol() {
    return isSetField(43031);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXRate get(quickfix.field.UnderlyingReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXRate getUnderlyingReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXRate() {
    return isSetField(43032);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXRateCalc get(quickfix.field.UnderlyingReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXRateCalc getUnderlyingReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXRateCalc() {
    return isSetField(43033);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateAmountRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateAmountRelativeTo get(quickfix.field.UnderlyingReturnRateAmountRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateAmountRelativeTo getUnderlyingReturnRateAmountRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateAmountRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateAmountRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateAmountRelativeTo() {
    return isSetField(43041);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteMeasureType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteMeasureType get(quickfix.field.UnderlyingReturnRateQuoteMeasureType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteMeasureType getUnderlyingReturnRateQuoteMeasureType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteMeasureType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteMeasureType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteMeasureType() {
    return isSetField(43042);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteUnits value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteUnits get(quickfix.field.UnderlyingReturnRateQuoteUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteUnits getUnderlyingReturnRateQuoteUnits() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteUnits());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteUnits field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteUnits() {
    return isSetField(43043);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteMethod get(quickfix.field.UnderlyingReturnRateQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteMethod getUnderlyingReturnRateQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteMethod() {
    return isSetField(43044);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteCurrency get(quickfix.field.UnderlyingReturnRateQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteCurrency getUnderlyingReturnRateQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteCurrency() {
    return isSetField(43045);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteCurrencyType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteCurrencyType get(quickfix.field.UnderlyingReturnRateQuoteCurrencyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteCurrencyType getUnderlyingReturnRateQuoteCurrencyType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteCurrencyType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteCurrencyType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteCurrencyType() {
    return isSetField(43046);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteTimeType get(quickfix.field.UnderlyingReturnRateQuoteTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteTimeType getUnderlyingReturnRateQuoteTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteTimeType() {
    return isSetField(43047);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteTime get(quickfix.field.UnderlyingReturnRateQuoteTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteTime getUnderlyingReturnRateQuoteTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteTime());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteTime() {
    return isSetField(43048);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteDate get(quickfix.field.UnderlyingReturnRateQuoteDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteDate getUnderlyingReturnRateQuoteDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteDate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteDate() {
    return isSetField(43049);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteExpirationTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteExpirationTime get(quickfix.field.UnderlyingReturnRateQuoteExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteExpirationTime getUnderlyingReturnRateQuoteExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteExpirationTime());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteExpirationTime() {
    return isSetField(43050);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteBusinessCenter get(quickfix.field.UnderlyingReturnRateQuoteBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteBusinessCenter getUnderlyingReturnRateQuoteBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteBusinessCenter() {
    return isSetField(43051);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteExchange value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteExchange get(quickfix.field.UnderlyingReturnRateQuoteExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteExchange getUnderlyingReturnRateQuoteExchange() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteExchange());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteExchange field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteExchange() {
    return isSetField(43052);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp get(quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp getUnderlyingReturnRateInformationSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateInformationSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateInformationSources get(quickfix.field.NoUnderlyingReturnRateInformationSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateInformationSources getNoUnderlyingReturnRateInformationSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateInformationSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateInformationSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateInformationSources() {
    return isSetField(43060);
  }

public static class NoUnderlyingReturnRateInformationSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43061, 43062, 43063, 0};

  public NoUnderlyingReturnRateInformationSources() {
    super(43060, 43061, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateInformationSource get(quickfix.field.UnderlyingReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateInformationSource getUnderlyingReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateInformationSource() {
    return isSetField(43061);
  }

  public void set(quickfix.field.UnderlyingReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateReferencePage get(quickfix.field.UnderlyingReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateReferencePage getUnderlyingReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateReferencePage() {
    return isSetField(43062);
  }

  public void set(quickfix.field.UnderlyingReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateReferencePageHeading get(quickfix.field.UnderlyingReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateReferencePageHeading getUnderlyingReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateReferencePageHeading() {
    return isSetField(43063);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateQuotePricingModel value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuotePricingModel get(quickfix.field.UnderlyingReturnRateQuotePricingModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuotePricingModel getUnderlyingReturnRateQuotePricingModel() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuotePricingModel());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuotePricingModel field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuotePricingModel() {
    return isSetField(43053);
  }

  public void set(quickfix.field.UnderlyingReturnRateCashFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateCashFlowType get(quickfix.field.UnderlyingReturnRateCashFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateCashFlowType getUnderlyingReturnRateCashFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateCashFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateCashFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateCashFlowType() {
    return isSetField(43054);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateDateGrp get(quickfix.fixlatest.component.UnderlyingReturnRateDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateDateGrp getUnderlyingReturnRateDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateDates get(quickfix.field.NoUnderlyingReturnRateDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateDates getNoUnderlyingReturnRateDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateDates() {
    return isSetField(43008);
  }

public static class NoUnderlyingReturnRateDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43009, 43071, 43010, 43011, 43012, 43013, 43014, 43015, 43016, 43017, 43018, 43019, 43020, 43021, 43022, 43023, 43024, 43025, 43026, 43027, 43028, 43029, 43069, 0};

  public NoUnderlyingReturnRateDates() {
    super(43008, 43009, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateDateMode get(quickfix.field.UnderlyingReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateDateMode getUnderlyingReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateDateMode() {
    return isSetField(43009);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp get(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp getUnderlyingReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates get(quickfix.field.NoUnderlyingReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates getNoUnderlyingReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDates() {
    return isSetField(43071);
  }

public static class NoUnderlyingReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43072, 43073, 0};

  public NoUnderlyingReturnRateValuationDates() {
    super(43071, 43072, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDate get(quickfix.field.UnderlyingReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDate getUnderlyingReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDate() {
    return isSetField(43072);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType get(quickfix.field.UnderlyingReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType getUnderlyingReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateType() {
    return isSetField(43073);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateRelativeTo getUnderlyingReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateRelativeTo() {
    return isSetField(43010);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod getUnderlyingReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetPeriod() {
    return isSetField(43011);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit getUnderlyingReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetUnit() {
    return isSetField(43012);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType getUnderlyingReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetDayType() {
    return isSetField(43013);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted get(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted getUnderlyingReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateUnadjusted() {
    return isSetField(43014);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo getUnderlyingReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateRelativeTo() {
    return isSetField(43015);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod getUnderlyingReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(43016);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit getUnderlyingReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetUnit() {
    return isSetField(43017);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType getUnderlyingReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetDayType() {
    return isSetField(43018);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted get(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted getUnderlyingReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateAdjusted() {
    return isSetField(43019);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted get(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted getUnderlyingReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateUnadjusted() {
    return isSetField(43020);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo getUnderlyingReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateRelativeTo() {
    return isSetField(43021);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod getUnderlyingReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(43022);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit getUnderlyingReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetUnit() {
    return isSetField(43023);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType getUnderlyingReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetDayType() {
    return isSetField(43024);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted get(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted getUnderlyingReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateAdjusted() {
    return isSetField(43025);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod get(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod getUnderlyingReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyPeriod() {
    return isSetField(43026);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyUnit get(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyUnit getUnderlyingReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyUnit() {
    return isSetField(43027);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention get(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention getUnderlyingReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyRollConvention() {
    return isSetField(43028);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention get(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention getUnderlyingReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessDayConvention() {
    return isSetField(43029);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp getUnderlyingReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters get(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters getNoUnderlyingReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDateBusinessCenters() {
    return isSetField(43069);
  }

public static class NoUnderlyingReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43070, 0};

  public NoUnderlyingReturnRateValuationDateBusinessCenters() {
    super(43069, 43070, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter get(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter getUnderlyingReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessCenter() {
    return isSetField(43070);
  }
}
}

  public void set(quickfix.field.UnderlyingReturnRateValuationTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationTimeType get(quickfix.field.UnderlyingReturnRateValuationTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationTimeType getUnderlyingReturnRateValuationTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationTimeType() {
    return isSetField(43055);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationTime get(quickfix.field.UnderlyingReturnRateValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationTime getUnderlyingReturnRateValuationTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationTime());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationTime() {
    return isSetField(43056);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter get(quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter getUnderlyingReturnRateValuationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationTimeBusinessCenter() {
    return isSetField(43057);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationPriceOption value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationPriceOption get(quickfix.field.UnderlyingReturnRateValuationPriceOption value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationPriceOption getUnderlyingReturnRateValuationPriceOption() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationPriceOption());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationPriceOption field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationPriceOption() {
    return isSetField(43058);
  }

  public void set(quickfix.field.UnderlyingReturnRateFinalPriceFallback value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFinalPriceFallback get(quickfix.field.UnderlyingReturnRateFinalPriceFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFinalPriceFallback getUnderlyingReturnRateFinalPriceFallback() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFinalPriceFallback());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFinalPriceFallback field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFinalPriceFallback() {
    return isSetField(43059);
  }
}

  public void set(quickfix.field.UnderlyingReturnRatePriceSequence value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceSequence get(quickfix.field.UnderlyingReturnRatePriceSequence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceSequence getUnderlyingReturnRatePriceSequence() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceSequence());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceSequence field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceSequence() {
    return isSetField(43035);
  }

  public void set(quickfix.field.UnderlyingReturnRateCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateCommissionBasis get(quickfix.field.UnderlyingReturnRateCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateCommissionBasis getUnderlyingReturnRateCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateCommissionBasis());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateCommissionBasis() {
    return isSetField(43036);
  }

  public void set(quickfix.field.UnderlyingReturnRateCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateCommissionAmount get(quickfix.field.UnderlyingReturnRateCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateCommissionAmount getUnderlyingReturnRateCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateCommissionAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateCommissionAmount() {
    return isSetField(43037);
  }

  public void set(quickfix.field.UnderlyingReturnRateCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateCommissionCurrency get(quickfix.field.UnderlyingReturnRateCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateCommissionCurrency getUnderlyingReturnRateCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateCommissionCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateCommissionCurrency() {
    return isSetField(43038);
  }

  public void set(quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade get(quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade getUnderlyingReturnRateTotalCommissionPerTrade() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateTotalCommissionPerTrade field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateTotalCommissionPerTrade() {
    return isSetField(43039);
  }

  public void set(quickfix.field.UnderlyingReturnRateDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateDeterminationMethod get(quickfix.field.UnderlyingReturnRateDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateDeterminationMethod getUnderlyingReturnRateDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateDeterminationMethod() {
    return isSetField(43040);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp get(quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp getUnderlyingReturnRatePriceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRatePriceGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRatePrices value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRatePrices get(quickfix.field.NoUnderlyingReturnRatePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRatePrices getNoUnderlyingReturnRatePrices() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRatePrices());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRatePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRatePrices() {
    return isSetField(43064);
  }

public static class NoUnderlyingReturnRatePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43065, 43066, 43067, 43068, 0};

  public NoUnderlyingReturnRatePrices() {
    super(43064, 43065, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceBasis get(quickfix.field.UnderlyingReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceBasis getUnderlyingReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceBasis() {
    return isSetField(43065);
  }

  public void set(quickfix.field.UnderlyingReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePrice get(quickfix.field.UnderlyingReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePrice getUnderlyingReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePrice() {
    return isSetField(43066);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceCurrency get(quickfix.field.UnderlyingReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceCurrency getUnderlyingReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceCurrency() {
    return isSetField(43067);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceType get(quickfix.field.UnderlyingReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceType getUnderlyingReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceType() {
    return isSetField(43068);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp get(quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp getUnderlyingReturnRateFXConversionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateFXConversionGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateFXConversions value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateFXConversions get(quickfix.field.NoUnderlyingReturnRateFXConversions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateFXConversions getNoUnderlyingReturnRateFXConversions() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateFXConversions());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateFXConversions field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateFXConversions() {
    return isSetField(43030);
  }

public static class NoUnderlyingReturnRateFXConversions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43031, 43032, 43033, 0};

  public NoUnderlyingReturnRateFXConversions() {
    super(43030, 43031, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXCurrencySymbol get(quickfix.field.UnderlyingReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXCurrencySymbol getUnderlyingReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXCurrencySymbol() {
    return isSetField(43031);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXRate get(quickfix.field.UnderlyingReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXRate getUnderlyingReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXRate() {
    return isSetField(43032);
  }

  public void set(quickfix.field.UnderlyingReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFXRateCalc get(quickfix.field.UnderlyingReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFXRateCalc getUnderlyingReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFXRateCalc() {
    return isSetField(43033);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateAmountRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateAmountRelativeTo get(quickfix.field.UnderlyingReturnRateAmountRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateAmountRelativeTo getUnderlyingReturnRateAmountRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateAmountRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateAmountRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateAmountRelativeTo() {
    return isSetField(43041);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteMeasureType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteMeasureType get(quickfix.field.UnderlyingReturnRateQuoteMeasureType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteMeasureType getUnderlyingReturnRateQuoteMeasureType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteMeasureType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteMeasureType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteMeasureType() {
    return isSetField(43042);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteUnits value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteUnits get(quickfix.field.UnderlyingReturnRateQuoteUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteUnits getUnderlyingReturnRateQuoteUnits() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteUnits());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteUnits field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteUnits() {
    return isSetField(43043);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteMethod get(quickfix.field.UnderlyingReturnRateQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteMethod getUnderlyingReturnRateQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteMethod() {
    return isSetField(43044);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteCurrency get(quickfix.field.UnderlyingReturnRateQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteCurrency getUnderlyingReturnRateQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteCurrency() {
    return isSetField(43045);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteCurrencyType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteCurrencyType get(quickfix.field.UnderlyingReturnRateQuoteCurrencyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteCurrencyType getUnderlyingReturnRateQuoteCurrencyType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteCurrencyType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteCurrencyType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteCurrencyType() {
    return isSetField(43046);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteTimeType get(quickfix.field.UnderlyingReturnRateQuoteTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteTimeType getUnderlyingReturnRateQuoteTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteTimeType() {
    return isSetField(43047);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteTime get(quickfix.field.UnderlyingReturnRateQuoteTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteTime getUnderlyingReturnRateQuoteTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteTime());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteTime() {
    return isSetField(43048);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteDate get(quickfix.field.UnderlyingReturnRateQuoteDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteDate getUnderlyingReturnRateQuoteDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteDate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteDate() {
    return isSetField(43049);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteExpirationTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteExpirationTime get(quickfix.field.UnderlyingReturnRateQuoteExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteExpirationTime getUnderlyingReturnRateQuoteExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteExpirationTime());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteExpirationTime() {
    return isSetField(43050);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteBusinessCenter get(quickfix.field.UnderlyingReturnRateQuoteBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteBusinessCenter getUnderlyingReturnRateQuoteBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteBusinessCenter() {
    return isSetField(43051);
  }

  public void set(quickfix.field.UnderlyingReturnRateQuoteExchange value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuoteExchange get(quickfix.field.UnderlyingReturnRateQuoteExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuoteExchange getUnderlyingReturnRateQuoteExchange() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuoteExchange());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuoteExchange field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuoteExchange() {
    return isSetField(43052);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp get(quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp getUnderlyingReturnRateInformationSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateInformationSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateInformationSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateInformationSources get(quickfix.field.NoUnderlyingReturnRateInformationSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateInformationSources getNoUnderlyingReturnRateInformationSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateInformationSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateInformationSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateInformationSources() {
    return isSetField(43060);
  }

public static class NoUnderlyingReturnRateInformationSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43061, 43062, 43063, 0};

  public NoUnderlyingReturnRateInformationSources() {
    super(43060, 43061, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateInformationSource get(quickfix.field.UnderlyingReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateInformationSource getUnderlyingReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateInformationSource() {
    return isSetField(43061);
  }

  public void set(quickfix.field.UnderlyingReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateReferencePage get(quickfix.field.UnderlyingReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateReferencePage getUnderlyingReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateReferencePage() {
    return isSetField(43062);
  }

  public void set(quickfix.field.UnderlyingReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateReferencePageHeading get(quickfix.field.UnderlyingReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateReferencePageHeading getUnderlyingReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateReferencePageHeading() {
    return isSetField(43063);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateQuotePricingModel value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateQuotePricingModel get(quickfix.field.UnderlyingReturnRateQuotePricingModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateQuotePricingModel getUnderlyingReturnRateQuotePricingModel() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateQuotePricingModel());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateQuotePricingModel field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateQuotePricingModel() {
    return isSetField(43053);
  }

  public void set(quickfix.field.UnderlyingReturnRateCashFlowType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateCashFlowType get(quickfix.field.UnderlyingReturnRateCashFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateCashFlowType getUnderlyingReturnRateCashFlowType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateCashFlowType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateCashFlowType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateCashFlowType() {
    return isSetField(43054);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateDateGrp get(quickfix.fixlatest.component.UnderlyingReturnRateDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateDateGrp getUnderlyingReturnRateDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateDates get(quickfix.field.NoUnderlyingReturnRateDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateDates getNoUnderlyingReturnRateDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateDates() {
    return isSetField(43008);
  }

public static class NoUnderlyingReturnRateDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43009, 43071, 43010, 43011, 43012, 43013, 43014, 43015, 43016, 43017, 43018, 43019, 43020, 43021, 43022, 43023, 43024, 43025, 43026, 43027, 43028, 43029, 43069, 0};

  public NoUnderlyingReturnRateDates() {
    super(43008, 43009, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateDateMode get(quickfix.field.UnderlyingReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateDateMode getUnderlyingReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateDateMode() {
    return isSetField(43009);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp get(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp getUnderlyingReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates get(quickfix.field.NoUnderlyingReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDates getNoUnderlyingReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDates() {
    return isSetField(43071);
  }

public static class NoUnderlyingReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43072, 43073, 0};

  public NoUnderlyingReturnRateValuationDates() {
    super(43071, 43072, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDate get(quickfix.field.UnderlyingReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDate getUnderlyingReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDate() {
    return isSetField(43072);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType get(quickfix.field.UnderlyingReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateType getUnderlyingReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateType() {
    return isSetField(43073);
  }
}

  public void set(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateRelativeTo getUnderlyingReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateRelativeTo() {
    return isSetField(43010);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod getUnderlyingReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetPeriod() {
    return isSetField(43011);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit getUnderlyingReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetUnit() {
    return isSetField(43012);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType getUnderlyingReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateOffsetDayType() {
    return isSetField(43013);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted get(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted getUnderlyingReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateUnadjusted() {
    return isSetField(43014);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo getUnderlyingReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateRelativeTo() {
    return isSetField(43015);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod getUnderlyingReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(43016);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit getUnderlyingReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetUnit() {
    return isSetField(43017);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType getUnderlyingReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateOffsetDayType() {
    return isSetField(43018);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted get(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted getUnderlyingReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationStartDateAdjusted() {
    return isSetField(43019);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted get(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted getUnderlyingReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateUnadjusted() {
    return isSetField(43020);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo get(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo getUnderlyingReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateRelativeTo() {
    return isSetField(43021);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod getUnderlyingReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(43022);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit getUnderlyingReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetUnit() {
    return isSetField(43023);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType get(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType getUnderlyingReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateOffsetDayType() {
    return isSetField(43024);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted get(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted getUnderlyingReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationEndDateAdjusted() {
    return isSetField(43025);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod get(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod getUnderlyingReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyPeriod() {
    return isSetField(43026);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyUnit get(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyUnit getUnderlyingReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyUnit() {
    return isSetField(43027);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention get(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention getUnderlyingReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationFrequencyRollConvention() {
    return isSetField(43028);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention get(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention getUnderlyingReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessDayConvention() {
    return isSetField(43029);
  }

  public void set(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp getUnderlyingReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters get(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters getNoUnderlyingReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRateValuationDateBusinessCenters() {
    return isSetField(43069);
  }

public static class NoUnderlyingReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43070, 0};

  public NoUnderlyingReturnRateValuationDateBusinessCenters() {
    super(43069, 43070, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter get(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter getUnderlyingReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationDateBusinessCenter() {
    return isSetField(43070);
  }
}
}

  public void set(quickfix.field.UnderlyingReturnRateValuationTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationTimeType get(quickfix.field.UnderlyingReturnRateValuationTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationTimeType getUnderlyingReturnRateValuationTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationTimeType() {
    return isSetField(43055);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationTime get(quickfix.field.UnderlyingReturnRateValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationTime getUnderlyingReturnRateValuationTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationTime());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationTime() {
    return isSetField(43056);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter get(quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter getUnderlyingReturnRateValuationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationTimeBusinessCenter() {
    return isSetField(43057);
  }

  public void set(quickfix.field.UnderlyingReturnRateValuationPriceOption value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateValuationPriceOption get(quickfix.field.UnderlyingReturnRateValuationPriceOption value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateValuationPriceOption getUnderlyingReturnRateValuationPriceOption() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateValuationPriceOption());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateValuationPriceOption field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateValuationPriceOption() {
    return isSetField(43058);
  }

  public void set(quickfix.field.UnderlyingReturnRateFinalPriceFallback value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRateFinalPriceFallback get(quickfix.field.UnderlyingReturnRateFinalPriceFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRateFinalPriceFallback getUnderlyingReturnRateFinalPriceFallback() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRateFinalPriceFallback());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRateFinalPriceFallback field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRateFinalPriceFallback() {
    return isSetField(43059);
  }
}
