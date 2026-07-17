/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ReturnRateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42735, };
  protected int[] getGroupFields() { return componentGroups; }

  public ReturnRateGrp() {
    super();
  }

  public void set(quickfix.field.NoReturnRates value) {
    setField(value);
  }

  public quickfix.field.NoReturnRates get(quickfix.field.NoReturnRates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRates getNoReturnRates() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRates());
  }

  public boolean isSet(quickfix.field.NoReturnRates field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRates() {
    return isSetField(42735);
  }

public static class NoReturnRates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42736, 42737, 42738, 42739, 42740, 42741, 42765, 42731, 42742, 42743, 42744, 42745, 42746, 42747, 42748, 42749, 42750, 42751, 42752, 42753, 42761, 42754, 42755, 42709, 42756, 42757, 42758, 42759, 42760, 0};

  public NoReturnRates() {
    super(42735, 42736, ORDER);
  }

  public void set(quickfix.field.ReturnRatePriceSequence value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceSequence get(quickfix.field.ReturnRatePriceSequence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceSequence getReturnRatePriceSequence() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceSequence());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceSequence field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceSequence() {
    return isSetField(42736);
  }

  public void set(quickfix.field.ReturnRateCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.ReturnRateCommissionBasis get(quickfix.field.ReturnRateCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateCommissionBasis getReturnRateCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateCommissionBasis());
  }

  public boolean isSet(quickfix.field.ReturnRateCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateCommissionBasis() {
    return isSetField(42737);
  }

  public void set(quickfix.field.ReturnRateCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.ReturnRateCommissionAmount get(quickfix.field.ReturnRateCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateCommissionAmount getReturnRateCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateCommissionAmount());
  }

  public boolean isSet(quickfix.field.ReturnRateCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateCommissionAmount() {
    return isSetField(42738);
  }

  public void set(quickfix.field.ReturnRateCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.ReturnRateCommissionCurrency get(quickfix.field.ReturnRateCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateCommissionCurrency getReturnRateCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateCommissionCurrency());
  }

  public boolean isSet(quickfix.field.ReturnRateCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateCommissionCurrency() {
    return isSetField(42739);
  }

  public void set(quickfix.field.ReturnRateTotalCommissionPerTrade value) {
    setField(value);
  }

  public quickfix.field.ReturnRateTotalCommissionPerTrade get(quickfix.field.ReturnRateTotalCommissionPerTrade value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateTotalCommissionPerTrade getReturnRateTotalCommissionPerTrade() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateTotalCommissionPerTrade());
  }

  public boolean isSet(quickfix.field.ReturnRateTotalCommissionPerTrade field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateTotalCommissionPerTrade() {
    return isSetField(42740);
  }

  public void set(quickfix.field.ReturnRateDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateDeterminationMethod get(quickfix.field.ReturnRateDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateDeterminationMethod getReturnRateDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateDeterminationMethod());
  }

  public boolean isSet(quickfix.field.ReturnRateDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateDeterminationMethod() {
    return isSetField(42741);
  }

  public void set(quickfix.fixlatest.component.ReturnRatePriceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRatePriceGrp get(quickfix.fixlatest.component.ReturnRatePriceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRatePriceGrp getReturnRatePriceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRatePriceGrp());
  }

  public void set(quickfix.field.NoReturnRatePrices value) {
    setField(value);
  }

  public quickfix.field.NoReturnRatePrices get(quickfix.field.NoReturnRatePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRatePrices getNoReturnRatePrices() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRatePrices());
  }

  public boolean isSet(quickfix.field.NoReturnRatePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRatePrices() {
    return isSetField(42765);
  }

public static class NoReturnRatePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42766, 42767, 42768, 42769, 0};

  public NoReturnRatePrices() {
    super(42765, 42766, ORDER);
  }

  public void set(quickfix.field.ReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceBasis get(quickfix.field.ReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceBasis getReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceBasis() {
    return isSetField(42766);
  }

  public void set(quickfix.field.ReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePrice get(quickfix.field.ReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePrice getReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePrice());
  }

  public boolean isSet(quickfix.field.ReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePrice() {
    return isSetField(42767);
  }

  public void set(quickfix.field.ReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceCurrency get(quickfix.field.ReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceCurrency getReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceCurrency() {
    return isSetField(42768);
  }

  public void set(quickfix.field.ReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceType get(quickfix.field.ReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceType getReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceType() {
    return isSetField(42769);
  }
}

  public void set(quickfix.fixlatest.component.ReturnRateFXConversionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateFXConversionGrp get(quickfix.fixlatest.component.ReturnRateFXConversionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateFXConversionGrp getReturnRateFXConversionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateFXConversionGrp());
  }

  public void set(quickfix.field.NoReturnRateFXConversions value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateFXConversions get(quickfix.field.NoReturnRateFXConversions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateFXConversions getNoReturnRateFXConversions() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateFXConversions());
  }

  public boolean isSet(quickfix.field.NoReturnRateFXConversions field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateFXConversions() {
    return isSetField(42731);
  }

public static class NoReturnRateFXConversions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42732, 42733, 42734, 0};

  public NoReturnRateFXConversions() {
    super(42731, 42732, ORDER);
  }

  public void set(quickfix.field.ReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXCurrencySymbol get(quickfix.field.ReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXCurrencySymbol getReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.ReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXCurrencySymbol() {
    return isSetField(42732);
  }

  public void set(quickfix.field.ReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXRate get(quickfix.field.ReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXRate getReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.ReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXRate() {
    return isSetField(42733);
  }

  public void set(quickfix.field.ReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXRateCalc get(quickfix.field.ReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXRateCalc getReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.ReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXRateCalc() {
    return isSetField(42734);
  }
}

  public void set(quickfix.field.ReturnRateAmountRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateAmountRelativeTo get(quickfix.field.ReturnRateAmountRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateAmountRelativeTo getReturnRateAmountRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateAmountRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateAmountRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateAmountRelativeTo() {
    return isSetField(42742);
  }

  public void set(quickfix.field.ReturnRateQuoteMeasureType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteMeasureType get(quickfix.field.ReturnRateQuoteMeasureType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteMeasureType getReturnRateQuoteMeasureType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteMeasureType());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteMeasureType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteMeasureType() {
    return isSetField(42743);
  }

  public void set(quickfix.field.ReturnRateQuoteUnits value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteUnits get(quickfix.field.ReturnRateQuoteUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteUnits getReturnRateQuoteUnits() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteUnits());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteUnits field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteUnits() {
    return isSetField(42744);
  }

  public void set(quickfix.field.ReturnRateQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteMethod get(quickfix.field.ReturnRateQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteMethod getReturnRateQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteMethod());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteMethod() {
    return isSetField(42745);
  }

  public void set(quickfix.field.ReturnRateQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteCurrency get(quickfix.field.ReturnRateQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteCurrency getReturnRateQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteCurrency());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteCurrency() {
    return isSetField(42746);
  }

  public void set(quickfix.field.ReturnRateQuoteCurrencyType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteCurrencyType get(quickfix.field.ReturnRateQuoteCurrencyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteCurrencyType getReturnRateQuoteCurrencyType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteCurrencyType());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteCurrencyType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteCurrencyType() {
    return isSetField(42747);
  }

  public void set(quickfix.field.ReturnRateQuoteTimeType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteTimeType get(quickfix.field.ReturnRateQuoteTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteTimeType getReturnRateQuoteTimeType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteTimeType());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteTimeType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteTimeType() {
    return isSetField(42748);
  }

  public void set(quickfix.field.ReturnRateQuoteTime value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteTime get(quickfix.field.ReturnRateQuoteTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteTime getReturnRateQuoteTime() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteTime());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteTime field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteTime() {
    return isSetField(42749);
  }

  public void set(quickfix.field.ReturnRateQuoteDate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteDate get(quickfix.field.ReturnRateQuoteDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteDate getReturnRateQuoteDate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteDate());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteDate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteDate() {
    return isSetField(42750);
  }

  public void set(quickfix.field.ReturnRateQuoteExpirationTime value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteExpirationTime get(quickfix.field.ReturnRateQuoteExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteExpirationTime getReturnRateQuoteExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteExpirationTime());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteExpirationTime() {
    return isSetField(42751);
  }

  public void set(quickfix.field.ReturnRateQuoteBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteBusinessCenter get(quickfix.field.ReturnRateQuoteBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteBusinessCenter getReturnRateQuoteBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteBusinessCenter() {
    return isSetField(42752);
  }

  public void set(quickfix.field.ReturnRateQuoteExchange value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteExchange get(quickfix.field.ReturnRateQuoteExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteExchange getReturnRateQuoteExchange() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteExchange());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteExchange field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteExchange() {
    return isSetField(42753);
  }

  public void set(quickfix.fixlatest.component.ReturnRateInformationSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateInformationSourceGrp get(quickfix.fixlatest.component.ReturnRateInformationSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateInformationSourceGrp getReturnRateInformationSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateInformationSourceGrp());
  }

  public void set(quickfix.field.NoReturnRateInformationSources value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateInformationSources get(quickfix.field.NoReturnRateInformationSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateInformationSources getNoReturnRateInformationSources() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateInformationSources());
  }

  public boolean isSet(quickfix.field.NoReturnRateInformationSources field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateInformationSources() {
    return isSetField(42761);
  }

public static class NoReturnRateInformationSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42762, 42763, 42764, 0};

  public NoReturnRateInformationSources() {
    super(42761, 42762, ORDER);
  }

  public void set(quickfix.field.ReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.ReturnRateInformationSource get(quickfix.field.ReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateInformationSource getReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.ReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateInformationSource() {
    return isSetField(42762);
  }

  public void set(quickfix.field.ReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.ReturnRateReferencePage get(quickfix.field.ReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateReferencePage getReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.ReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateReferencePage() {
    return isSetField(42763);
  }

  public void set(quickfix.field.ReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.ReturnRateReferencePageHeading get(quickfix.field.ReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateReferencePageHeading getReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.ReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateReferencePageHeading() {
    return isSetField(42764);
  }
}

  public void set(quickfix.field.ReturnRateQuotePricingModel value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuotePricingModel get(quickfix.field.ReturnRateQuotePricingModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuotePricingModel getReturnRateQuotePricingModel() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuotePricingModel());
  }

  public boolean isSet(quickfix.field.ReturnRateQuotePricingModel field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuotePricingModel() {
    return isSetField(42754);
  }

  public void set(quickfix.field.ReturnRateCashFlowType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateCashFlowType get(quickfix.field.ReturnRateCashFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateCashFlowType getReturnRateCashFlowType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateCashFlowType());
  }

  public boolean isSet(quickfix.field.ReturnRateCashFlowType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateCashFlowType() {
    return isSetField(42755);
  }

  public void set(quickfix.fixlatest.component.ReturnRateDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateDateGrp get(quickfix.fixlatest.component.ReturnRateDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateDateGrp getReturnRateDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateDateGrp());
  }

  public void set(quickfix.field.NoReturnRateDates value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateDates get(quickfix.field.NoReturnRateDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateDates getNoReturnRateDates() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateDates());
  }

  public boolean isSet(quickfix.field.NoReturnRateDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateDates() {
    return isSetField(42709);
  }

public static class NoReturnRateDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42710, 42772, 42711, 42712, 42713, 42714, 42715, 42716, 42717, 42718, 42719, 42720, 42721, 42722, 42723, 42724, 42725, 42726, 42727, 42728, 42729, 42730, 42770, 0};

  public NoReturnRateDates() {
    super(42709, 42710, ORDER);
  }

  public void set(quickfix.field.ReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.ReturnRateDateMode get(quickfix.field.ReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateDateMode getReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.ReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateDateMode() {
    return isSetField(42710);
  }

  public void set(quickfix.fixlatest.component.ReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateGrp get(quickfix.fixlatest.component.ReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateGrp getReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDates get(quickfix.field.NoReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDates getNoReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDates() {
    return isSetField(42772);
  }

public static class NoReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42773, 42774, 0};

  public NoReturnRateValuationDates() {
    super(42772, 42773, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDate get(quickfix.field.ReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDate getReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDate() {
    return isSetField(42773);
  }

  public void set(quickfix.field.ReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateType get(quickfix.field.ReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateType getReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateType() {
    return isSetField(42774);
  }
}

  public void set(quickfix.field.ReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateRelativeTo get(quickfix.field.ReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateRelativeTo getReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateRelativeTo() {
    return isSetField(42711);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetPeriod get(quickfix.field.ReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetPeriod getReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetPeriod() {
    return isSetField(42712);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetUnit get(quickfix.field.ReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetUnit getReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetUnit() {
    return isSetField(42713);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetDayType get(quickfix.field.ReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetDayType getReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetDayType() {
    return isSetField(42714);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateUnadjusted get(quickfix.field.ReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateUnadjusted getReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateUnadjusted() {
    return isSetField(42715);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateRelativeTo get(quickfix.field.ReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateRelativeTo getReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateRelativeTo() {
    return isSetField(42716);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetPeriod get(quickfix.field.ReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetPeriod getReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(42717);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetUnit get(quickfix.field.ReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetUnit getReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetUnit() {
    return isSetField(42718);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetDayType get(quickfix.field.ReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetDayType getReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetDayType() {
    return isSetField(42719);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateAdjusted get(quickfix.field.ReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateAdjusted getReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateAdjusted() {
    return isSetField(42720);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateUnadjusted get(quickfix.field.ReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateUnadjusted getReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateUnadjusted() {
    return isSetField(42721);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateRelativeTo get(quickfix.field.ReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateRelativeTo getReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateRelativeTo() {
    return isSetField(42722);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetPeriod get(quickfix.field.ReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetPeriod getReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(42723);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetUnit get(quickfix.field.ReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetUnit getReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetUnit() {
    return isSetField(42724);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetDayType get(quickfix.field.ReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetDayType getReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetDayType() {
    return isSetField(42725);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateAdjusted get(quickfix.field.ReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateAdjusted getReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateAdjusted() {
    return isSetField(42726);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyPeriod get(quickfix.field.ReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyPeriod getReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyPeriod() {
    return isSetField(42727);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyUnit get(quickfix.field.ReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyUnit getReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyUnit() {
    return isSetField(42728);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyRollConvention get(quickfix.field.ReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyRollConvention getReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyRollConvention() {
    return isSetField(42729);
  }

  public void set(quickfix.field.ReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessDayConvention get(quickfix.field.ReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessDayConvention getReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessDayConvention() {
    return isSetField(42730);
  }

  public void set(quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp getReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters get(quickfix.field.NoReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters getNoReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDateBusinessCenters() {
    return isSetField(42770);
  }

public static class NoReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42771, 0};

  public NoReturnRateValuationDateBusinessCenters() {
    super(42770, 42771, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter get(quickfix.field.ReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter getReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessCenter() {
    return isSetField(42771);
  }
}
}

  public void set(quickfix.field.ReturnRateValuationTimeType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationTimeType get(quickfix.field.ReturnRateValuationTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationTimeType getReturnRateValuationTimeType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationTimeType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationTimeType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationTimeType() {
    return isSetField(42756);
  }

  public void set(quickfix.field.ReturnRateValuationTime value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationTime get(quickfix.field.ReturnRateValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationTime getReturnRateValuationTime() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationTime());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationTime() {
    return isSetField(42757);
  }

  public void set(quickfix.field.ReturnRateValuationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationTimeBusinessCenter get(quickfix.field.ReturnRateValuationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationTimeBusinessCenter getReturnRateValuationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationTimeBusinessCenter() {
    return isSetField(42758);
  }

  public void set(quickfix.field.ReturnRateValuationPriceOption value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationPriceOption get(quickfix.field.ReturnRateValuationPriceOption value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationPriceOption getReturnRateValuationPriceOption() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationPriceOption());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationPriceOption field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationPriceOption() {
    return isSetField(42759);
  }

  public void set(quickfix.field.ReturnRateFinalPriceFallback value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFinalPriceFallback get(quickfix.field.ReturnRateFinalPriceFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFinalPriceFallback getReturnRateFinalPriceFallback() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFinalPriceFallback());
  }

  public boolean isSet(quickfix.field.ReturnRateFinalPriceFallback field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFinalPriceFallback() {
    return isSetField(42760);
  }
}

  public void set(quickfix.field.ReturnRatePriceSequence value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceSequence get(quickfix.field.ReturnRatePriceSequence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceSequence getReturnRatePriceSequence() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceSequence());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceSequence field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceSequence() {
    return isSetField(42736);
  }

  public void set(quickfix.field.ReturnRateCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.ReturnRateCommissionBasis get(quickfix.field.ReturnRateCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateCommissionBasis getReturnRateCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateCommissionBasis());
  }

  public boolean isSet(quickfix.field.ReturnRateCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateCommissionBasis() {
    return isSetField(42737);
  }

  public void set(quickfix.field.ReturnRateCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.ReturnRateCommissionAmount get(quickfix.field.ReturnRateCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateCommissionAmount getReturnRateCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateCommissionAmount());
  }

  public boolean isSet(quickfix.field.ReturnRateCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateCommissionAmount() {
    return isSetField(42738);
  }

  public void set(quickfix.field.ReturnRateCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.ReturnRateCommissionCurrency get(quickfix.field.ReturnRateCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateCommissionCurrency getReturnRateCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateCommissionCurrency());
  }

  public boolean isSet(quickfix.field.ReturnRateCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateCommissionCurrency() {
    return isSetField(42739);
  }

  public void set(quickfix.field.ReturnRateTotalCommissionPerTrade value) {
    setField(value);
  }

  public quickfix.field.ReturnRateTotalCommissionPerTrade get(quickfix.field.ReturnRateTotalCommissionPerTrade value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateTotalCommissionPerTrade getReturnRateTotalCommissionPerTrade() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateTotalCommissionPerTrade());
  }

  public boolean isSet(quickfix.field.ReturnRateTotalCommissionPerTrade field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateTotalCommissionPerTrade() {
    return isSetField(42740);
  }

  public void set(quickfix.field.ReturnRateDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateDeterminationMethod get(quickfix.field.ReturnRateDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateDeterminationMethod getReturnRateDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateDeterminationMethod());
  }

  public boolean isSet(quickfix.field.ReturnRateDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateDeterminationMethod() {
    return isSetField(42741);
  }

  public void set(quickfix.fixlatest.component.ReturnRatePriceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRatePriceGrp get(quickfix.fixlatest.component.ReturnRatePriceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRatePriceGrp getReturnRatePriceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRatePriceGrp());
  }

  public void set(quickfix.field.NoReturnRatePrices value) {
    setField(value);
  }

  public quickfix.field.NoReturnRatePrices get(quickfix.field.NoReturnRatePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRatePrices getNoReturnRatePrices() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRatePrices());
  }

  public boolean isSet(quickfix.field.NoReturnRatePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRatePrices() {
    return isSetField(42765);
  }

public static class NoReturnRatePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42766, 42767, 42768, 42769, 0};

  public NoReturnRatePrices() {
    super(42765, 42766, ORDER);
  }

  public void set(quickfix.field.ReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceBasis get(quickfix.field.ReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceBasis getReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceBasis() {
    return isSetField(42766);
  }

  public void set(quickfix.field.ReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePrice get(quickfix.field.ReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePrice getReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePrice());
  }

  public boolean isSet(quickfix.field.ReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePrice() {
    return isSetField(42767);
  }

  public void set(quickfix.field.ReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceCurrency get(quickfix.field.ReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceCurrency getReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceCurrency() {
    return isSetField(42768);
  }

  public void set(quickfix.field.ReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceType get(quickfix.field.ReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceType getReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceType() {
    return isSetField(42769);
  }
}

  public void set(quickfix.fixlatest.component.ReturnRateFXConversionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateFXConversionGrp get(quickfix.fixlatest.component.ReturnRateFXConversionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateFXConversionGrp getReturnRateFXConversionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateFXConversionGrp());
  }

  public void set(quickfix.field.NoReturnRateFXConversions value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateFXConversions get(quickfix.field.NoReturnRateFXConversions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateFXConversions getNoReturnRateFXConversions() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateFXConversions());
  }

  public boolean isSet(quickfix.field.NoReturnRateFXConversions field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateFXConversions() {
    return isSetField(42731);
  }

public static class NoReturnRateFXConversions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42732, 42733, 42734, 0};

  public NoReturnRateFXConversions() {
    super(42731, 42732, ORDER);
  }

  public void set(quickfix.field.ReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXCurrencySymbol get(quickfix.field.ReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXCurrencySymbol getReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.ReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXCurrencySymbol() {
    return isSetField(42732);
  }

  public void set(quickfix.field.ReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXRate get(quickfix.field.ReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXRate getReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.ReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXRate() {
    return isSetField(42733);
  }

  public void set(quickfix.field.ReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFXRateCalc get(quickfix.field.ReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFXRateCalc getReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.ReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFXRateCalc() {
    return isSetField(42734);
  }
}

  public void set(quickfix.field.ReturnRateAmountRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateAmountRelativeTo get(quickfix.field.ReturnRateAmountRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateAmountRelativeTo getReturnRateAmountRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateAmountRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateAmountRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateAmountRelativeTo() {
    return isSetField(42742);
  }

  public void set(quickfix.field.ReturnRateQuoteMeasureType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteMeasureType get(quickfix.field.ReturnRateQuoteMeasureType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteMeasureType getReturnRateQuoteMeasureType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteMeasureType());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteMeasureType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteMeasureType() {
    return isSetField(42743);
  }

  public void set(quickfix.field.ReturnRateQuoteUnits value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteUnits get(quickfix.field.ReturnRateQuoteUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteUnits getReturnRateQuoteUnits() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteUnits());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteUnits field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteUnits() {
    return isSetField(42744);
  }

  public void set(quickfix.field.ReturnRateQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteMethod get(quickfix.field.ReturnRateQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteMethod getReturnRateQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteMethod());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteMethod() {
    return isSetField(42745);
  }

  public void set(quickfix.field.ReturnRateQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteCurrency get(quickfix.field.ReturnRateQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteCurrency getReturnRateQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteCurrency());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteCurrency() {
    return isSetField(42746);
  }

  public void set(quickfix.field.ReturnRateQuoteCurrencyType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteCurrencyType get(quickfix.field.ReturnRateQuoteCurrencyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteCurrencyType getReturnRateQuoteCurrencyType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteCurrencyType());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteCurrencyType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteCurrencyType() {
    return isSetField(42747);
  }

  public void set(quickfix.field.ReturnRateQuoteTimeType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteTimeType get(quickfix.field.ReturnRateQuoteTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteTimeType getReturnRateQuoteTimeType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteTimeType());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteTimeType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteTimeType() {
    return isSetField(42748);
  }

  public void set(quickfix.field.ReturnRateQuoteTime value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteTime get(quickfix.field.ReturnRateQuoteTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteTime getReturnRateQuoteTime() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteTime());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteTime field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteTime() {
    return isSetField(42749);
  }

  public void set(quickfix.field.ReturnRateQuoteDate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteDate get(quickfix.field.ReturnRateQuoteDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteDate getReturnRateQuoteDate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteDate());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteDate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteDate() {
    return isSetField(42750);
  }

  public void set(quickfix.field.ReturnRateQuoteExpirationTime value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteExpirationTime get(quickfix.field.ReturnRateQuoteExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteExpirationTime getReturnRateQuoteExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteExpirationTime());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteExpirationTime() {
    return isSetField(42751);
  }

  public void set(quickfix.field.ReturnRateQuoteBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteBusinessCenter get(quickfix.field.ReturnRateQuoteBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteBusinessCenter getReturnRateQuoteBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteBusinessCenter() {
    return isSetField(42752);
  }

  public void set(quickfix.field.ReturnRateQuoteExchange value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuoteExchange get(quickfix.field.ReturnRateQuoteExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuoteExchange getReturnRateQuoteExchange() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuoteExchange());
  }

  public boolean isSet(quickfix.field.ReturnRateQuoteExchange field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuoteExchange() {
    return isSetField(42753);
  }

  public void set(quickfix.fixlatest.component.ReturnRateInformationSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateInformationSourceGrp get(quickfix.fixlatest.component.ReturnRateInformationSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateInformationSourceGrp getReturnRateInformationSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateInformationSourceGrp());
  }

  public void set(quickfix.field.NoReturnRateInformationSources value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateInformationSources get(quickfix.field.NoReturnRateInformationSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateInformationSources getNoReturnRateInformationSources() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateInformationSources());
  }

  public boolean isSet(quickfix.field.NoReturnRateInformationSources field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateInformationSources() {
    return isSetField(42761);
  }

public static class NoReturnRateInformationSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42762, 42763, 42764, 0};

  public NoReturnRateInformationSources() {
    super(42761, 42762, ORDER);
  }

  public void set(quickfix.field.ReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.ReturnRateInformationSource get(quickfix.field.ReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateInformationSource getReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.ReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateInformationSource() {
    return isSetField(42762);
  }

  public void set(quickfix.field.ReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.ReturnRateReferencePage get(quickfix.field.ReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateReferencePage getReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.ReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateReferencePage() {
    return isSetField(42763);
  }

  public void set(quickfix.field.ReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.ReturnRateReferencePageHeading get(quickfix.field.ReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateReferencePageHeading getReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.ReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateReferencePageHeading() {
    return isSetField(42764);
  }
}

  public void set(quickfix.field.ReturnRateQuotePricingModel value) {
    setField(value);
  }

  public quickfix.field.ReturnRateQuotePricingModel get(quickfix.field.ReturnRateQuotePricingModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateQuotePricingModel getReturnRateQuotePricingModel() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateQuotePricingModel());
  }

  public boolean isSet(quickfix.field.ReturnRateQuotePricingModel field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateQuotePricingModel() {
    return isSetField(42754);
  }

  public void set(quickfix.field.ReturnRateCashFlowType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateCashFlowType get(quickfix.field.ReturnRateCashFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateCashFlowType getReturnRateCashFlowType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateCashFlowType());
  }

  public boolean isSet(quickfix.field.ReturnRateCashFlowType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateCashFlowType() {
    return isSetField(42755);
  }

  public void set(quickfix.fixlatest.component.ReturnRateDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateDateGrp get(quickfix.fixlatest.component.ReturnRateDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateDateGrp getReturnRateDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateDateGrp());
  }

  public void set(quickfix.field.NoReturnRateDates value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateDates get(quickfix.field.NoReturnRateDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateDates getNoReturnRateDates() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateDates());
  }

  public boolean isSet(quickfix.field.NoReturnRateDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateDates() {
    return isSetField(42709);
  }

public static class NoReturnRateDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42710, 42772, 42711, 42712, 42713, 42714, 42715, 42716, 42717, 42718, 42719, 42720, 42721, 42722, 42723, 42724, 42725, 42726, 42727, 42728, 42729, 42730, 42770, 0};

  public NoReturnRateDates() {
    super(42709, 42710, ORDER);
  }

  public void set(quickfix.field.ReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.ReturnRateDateMode get(quickfix.field.ReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateDateMode getReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.ReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateDateMode() {
    return isSetField(42710);
  }

  public void set(quickfix.fixlatest.component.ReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateGrp get(quickfix.fixlatest.component.ReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateGrp getReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDates get(quickfix.field.NoReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDates getNoReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDates() {
    return isSetField(42772);
  }

public static class NoReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42773, 42774, 0};

  public NoReturnRateValuationDates() {
    super(42772, 42773, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDate get(quickfix.field.ReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDate getReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDate() {
    return isSetField(42773);
  }

  public void set(quickfix.field.ReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateType get(quickfix.field.ReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateType getReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateType() {
    return isSetField(42774);
  }
}

  public void set(quickfix.field.ReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateRelativeTo get(quickfix.field.ReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateRelativeTo getReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateRelativeTo() {
    return isSetField(42711);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetPeriod get(quickfix.field.ReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetPeriod getReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetPeriod() {
    return isSetField(42712);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetUnit get(quickfix.field.ReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetUnit getReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetUnit() {
    return isSetField(42713);
  }

  public void set(quickfix.field.ReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateOffsetDayType get(quickfix.field.ReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateOffsetDayType getReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateOffsetDayType() {
    return isSetField(42714);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateUnadjusted get(quickfix.field.ReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateUnadjusted getReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateUnadjusted() {
    return isSetField(42715);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateRelativeTo get(quickfix.field.ReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateRelativeTo getReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateRelativeTo() {
    return isSetField(42716);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetPeriod get(quickfix.field.ReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetPeriod getReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(42717);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetUnit get(quickfix.field.ReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetUnit getReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetUnit() {
    return isSetField(42718);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetDayType get(quickfix.field.ReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateOffsetDayType getReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateOffsetDayType() {
    return isSetField(42719);
  }

  public void set(quickfix.field.ReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationStartDateAdjusted get(quickfix.field.ReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationStartDateAdjusted getReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationStartDateAdjusted() {
    return isSetField(42720);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateUnadjusted get(quickfix.field.ReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateUnadjusted getReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateUnadjusted() {
    return isSetField(42721);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateRelativeTo get(quickfix.field.ReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateRelativeTo getReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateRelativeTo() {
    return isSetField(42722);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetPeriod get(quickfix.field.ReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetPeriod getReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(42723);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetUnit get(quickfix.field.ReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetUnit getReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetUnit() {
    return isSetField(42724);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetDayType get(quickfix.field.ReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateOffsetDayType getReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateOffsetDayType() {
    return isSetField(42725);
  }

  public void set(quickfix.field.ReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationEndDateAdjusted get(quickfix.field.ReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationEndDateAdjusted getReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationEndDateAdjusted() {
    return isSetField(42726);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyPeriod get(quickfix.field.ReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyPeriod getReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyPeriod() {
    return isSetField(42727);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyUnit get(quickfix.field.ReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyUnit getReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyUnit() {
    return isSetField(42728);
  }

  public void set(quickfix.field.ReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationFrequencyRollConvention get(quickfix.field.ReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationFrequencyRollConvention getReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationFrequencyRollConvention() {
    return isSetField(42729);
  }

  public void set(quickfix.field.ReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessDayConvention get(quickfix.field.ReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessDayConvention getReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessDayConvention() {
    return isSetField(42730);
  }

  public void set(quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp getReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters get(quickfix.field.NoReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDateBusinessCenters getNoReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDateBusinessCenters() {
    return isSetField(42770);
  }

public static class NoReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42771, 0};

  public NoReturnRateValuationDateBusinessCenters() {
    super(42770, 42771, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter get(quickfix.field.ReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateBusinessCenter getReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateBusinessCenter() {
    return isSetField(42771);
  }
}
}

  public void set(quickfix.field.ReturnRateValuationTimeType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationTimeType get(quickfix.field.ReturnRateValuationTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationTimeType getReturnRateValuationTimeType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationTimeType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationTimeType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationTimeType() {
    return isSetField(42756);
  }

  public void set(quickfix.field.ReturnRateValuationTime value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationTime get(quickfix.field.ReturnRateValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationTime getReturnRateValuationTime() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationTime());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationTime() {
    return isSetField(42757);
  }

  public void set(quickfix.field.ReturnRateValuationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationTimeBusinessCenter get(quickfix.field.ReturnRateValuationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationTimeBusinessCenter getReturnRateValuationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationTimeBusinessCenter() {
    return isSetField(42758);
  }

  public void set(quickfix.field.ReturnRateValuationPriceOption value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationPriceOption get(quickfix.field.ReturnRateValuationPriceOption value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationPriceOption getReturnRateValuationPriceOption() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationPriceOption());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationPriceOption field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationPriceOption() {
    return isSetField(42759);
  }

  public void set(quickfix.field.ReturnRateFinalPriceFallback value) {
    setField(value);
  }

  public quickfix.field.ReturnRateFinalPriceFallback get(quickfix.field.ReturnRateFinalPriceFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateFinalPriceFallback getReturnRateFinalPriceFallback() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateFinalPriceFallback());
  }

  public boolean isSet(quickfix.field.ReturnRateFinalPriceFallback field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateFinalPriceFallback() {
    return isSetField(42760);
  }
}
