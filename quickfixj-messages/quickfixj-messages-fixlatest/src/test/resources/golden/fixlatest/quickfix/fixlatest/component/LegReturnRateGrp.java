/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegReturnRateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42534, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegReturnRateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegReturnRates value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRates get(quickfix.field.NoLegReturnRates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRates getNoLegReturnRates() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRates());
  }

  public boolean isSet(quickfix.field.NoLegReturnRates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRates() {
    return isSetField(42534);
  }

public static class NoLegReturnRates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42535, 42536, 42537, 42538, 42539, 42540, 42564, 42530, 42541, 42542, 42543, 42544, 42545, 42546, 42547, 42548, 42549, 42550, 42551, 42552, 42560, 42553, 42554, 42508, 42555, 42556, 42557, 42558, 42559, 0};

  public NoLegReturnRates() {
    super(42534, 42535, ORDER);
  }

  public void set(quickfix.field.LegReturnRatePriceSequence value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceSequence get(quickfix.field.LegReturnRatePriceSequence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceSequence getLegReturnRatePriceSequence() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceSequence());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceSequence field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceSequence() {
    return isSetField(42535);
  }

  public void set(quickfix.field.LegReturnRateCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateCommissionBasis get(quickfix.field.LegReturnRateCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateCommissionBasis getLegReturnRateCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateCommissionBasis());
  }

  public boolean isSet(quickfix.field.LegReturnRateCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateCommissionBasis() {
    return isSetField(42536);
  }

  public void set(quickfix.field.LegReturnRateCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateCommissionAmount get(quickfix.field.LegReturnRateCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateCommissionAmount getLegReturnRateCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateCommissionAmount());
  }

  public boolean isSet(quickfix.field.LegReturnRateCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateCommissionAmount() {
    return isSetField(42537);
  }

  public void set(quickfix.field.LegReturnRateCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateCommissionCurrency get(quickfix.field.LegReturnRateCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateCommissionCurrency getLegReturnRateCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateCommissionCurrency());
  }

  public boolean isSet(quickfix.field.LegReturnRateCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateCommissionCurrency() {
    return isSetField(42538);
  }

  public void set(quickfix.field.LegReturnRateTotalCommissionPerTrade value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateTotalCommissionPerTrade get(quickfix.field.LegReturnRateTotalCommissionPerTrade value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateTotalCommissionPerTrade getLegReturnRateTotalCommissionPerTrade() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateTotalCommissionPerTrade());
  }

  public boolean isSet(quickfix.field.LegReturnRateTotalCommissionPerTrade field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateTotalCommissionPerTrade() {
    return isSetField(42539);
  }

  public void set(quickfix.field.LegReturnRateDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateDeterminationMethod get(quickfix.field.LegReturnRateDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateDeterminationMethod getLegReturnRateDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegReturnRateDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateDeterminationMethod() {
    return isSetField(42540);
  }

  public void set(quickfix.fixlatest.component.LegReturnRatePriceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRatePriceGrp get(quickfix.fixlatest.component.LegReturnRatePriceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRatePriceGrp getLegReturnRatePriceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRatePriceGrp());
  }

  public void set(quickfix.field.NoLegReturnRatePrices value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRatePrices get(quickfix.field.NoLegReturnRatePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRatePrices getNoLegReturnRatePrices() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRatePrices());
  }

  public boolean isSet(quickfix.field.NoLegReturnRatePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRatePrices() {
    return isSetField(42564);
  }

public static class NoLegReturnRatePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42565, 42566, 42567, 42568, 0};

  public NoLegReturnRatePrices() {
    super(42564, 42565, ORDER);
  }

  public void set(quickfix.field.LegReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceBasis get(quickfix.field.LegReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceBasis getLegReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceBasis() {
    return isSetField(42565);
  }

  public void set(quickfix.field.LegReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePrice get(quickfix.field.LegReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePrice getLegReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePrice());
  }

  public boolean isSet(quickfix.field.LegReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePrice() {
    return isSetField(42566);
  }

  public void set(quickfix.field.LegReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceCurrency get(quickfix.field.LegReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceCurrency getLegReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceCurrency() {
    return isSetField(42567);
  }

  public void set(quickfix.field.LegReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceType get(quickfix.field.LegReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceType getLegReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceType() {
    return isSetField(42568);
  }
}

  public void set(quickfix.fixlatest.component.LegReturnRateFXConversionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateFXConversionGrp get(quickfix.fixlatest.component.LegReturnRateFXConversionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateFXConversionGrp getLegReturnRateFXConversionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateFXConversionGrp());
  }

  public void set(quickfix.field.NoLegReturnRateFXConversions value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateFXConversions get(quickfix.field.NoLegReturnRateFXConversions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateFXConversions getNoLegReturnRateFXConversions() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateFXConversions());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateFXConversions field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateFXConversions() {
    return isSetField(42530);
  }

public static class NoLegReturnRateFXConversions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42531, 42532, 42533, 0};

  public NoLegReturnRateFXConversions() {
    super(42530, 42531, ORDER);
  }

  public void set(quickfix.field.LegReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXCurrencySymbol get(quickfix.field.LegReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXCurrencySymbol getLegReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXCurrencySymbol() {
    return isSetField(42531);
  }

  public void set(quickfix.field.LegReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXRate get(quickfix.field.LegReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXRate getLegReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXRate() {
    return isSetField(42532);
  }

  public void set(quickfix.field.LegReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXRateCalc get(quickfix.field.LegReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXRateCalc getLegReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXRateCalc() {
    return isSetField(42533);
  }
}

  public void set(quickfix.field.LegReturnRateAmountRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateAmountRelativeTo get(quickfix.field.LegReturnRateAmountRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateAmountRelativeTo getLegReturnRateAmountRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateAmountRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateAmountRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateAmountRelativeTo() {
    return isSetField(42541);
  }

  public void set(quickfix.field.LegReturnRateQuoteMeasureType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteMeasureType get(quickfix.field.LegReturnRateQuoteMeasureType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteMeasureType getLegReturnRateQuoteMeasureType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteMeasureType());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteMeasureType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteMeasureType() {
    return isSetField(42542);
  }

  public void set(quickfix.field.LegReturnRateQuoteUnits value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteUnits get(quickfix.field.LegReturnRateQuoteUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteUnits getLegReturnRateQuoteUnits() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteUnits());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteUnits field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteUnits() {
    return isSetField(42543);
  }

  public void set(quickfix.field.LegReturnRateQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteMethod get(quickfix.field.LegReturnRateQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteMethod getLegReturnRateQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteMethod());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteMethod() {
    return isSetField(42544);
  }

  public void set(quickfix.field.LegReturnRateQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteCurrency get(quickfix.field.LegReturnRateQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteCurrency getLegReturnRateQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteCurrency());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteCurrency() {
    return isSetField(42545);
  }

  public void set(quickfix.field.LegReturnRateQuoteCurrencyType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteCurrencyType get(quickfix.field.LegReturnRateQuoteCurrencyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteCurrencyType getLegReturnRateQuoteCurrencyType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteCurrencyType());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteCurrencyType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteCurrencyType() {
    return isSetField(42546);
  }

  public void set(quickfix.field.LegReturnRateQuoteTimeType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteTimeType get(quickfix.field.LegReturnRateQuoteTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteTimeType getLegReturnRateQuoteTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteTimeType());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteTimeType() {
    return isSetField(42547);
  }

  public void set(quickfix.field.LegReturnRateQuoteTime value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteTime get(quickfix.field.LegReturnRateQuoteTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteTime getLegReturnRateQuoteTime() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteTime());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteTime field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteTime() {
    return isSetField(42548);
  }

  public void set(quickfix.field.LegReturnRateQuoteDate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteDate get(quickfix.field.LegReturnRateQuoteDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteDate getLegReturnRateQuoteDate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteDate());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteDate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteDate() {
    return isSetField(42549);
  }

  public void set(quickfix.field.LegReturnRateQuoteExpirationTime value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteExpirationTime get(quickfix.field.LegReturnRateQuoteExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteExpirationTime getLegReturnRateQuoteExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteExpirationTime());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteExpirationTime() {
    return isSetField(42550);
  }

  public void set(quickfix.field.LegReturnRateQuoteBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteBusinessCenter get(quickfix.field.LegReturnRateQuoteBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteBusinessCenter getLegReturnRateQuoteBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteBusinessCenter() {
    return isSetField(42551);
  }

  public void set(quickfix.field.LegReturnRateQuoteExchange value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteExchange get(quickfix.field.LegReturnRateQuoteExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteExchange getLegReturnRateQuoteExchange() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteExchange());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteExchange field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteExchange() {
    return isSetField(42552);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateInformationSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateInformationSourceGrp get(quickfix.fixlatest.component.LegReturnRateInformationSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateInformationSourceGrp getLegReturnRateInformationSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateInformationSourceGrp());
  }

  public void set(quickfix.field.NoLegReturnRateInformationSources value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateInformationSources get(quickfix.field.NoLegReturnRateInformationSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateInformationSources getNoLegReturnRateInformationSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateInformationSources());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateInformationSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateInformationSources() {
    return isSetField(42560);
  }

public static class NoLegReturnRateInformationSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42561, 42562, 42563, 0};

  public NoLegReturnRateInformationSources() {
    super(42560, 42561, ORDER);
  }

  public void set(quickfix.field.LegReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateInformationSource get(quickfix.field.LegReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateInformationSource getLegReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.LegReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateInformationSource() {
    return isSetField(42561);
  }

  public void set(quickfix.field.LegReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateReferencePage get(quickfix.field.LegReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateReferencePage getLegReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.LegReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateReferencePage() {
    return isSetField(42562);
  }

  public void set(quickfix.field.LegReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateReferencePageHeading get(quickfix.field.LegReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateReferencePageHeading getLegReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateReferencePageHeading() {
    return isSetField(42563);
  }
}

  public void set(quickfix.field.LegReturnRateQuotePricingModel value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuotePricingModel get(quickfix.field.LegReturnRateQuotePricingModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuotePricingModel getLegReturnRateQuotePricingModel() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuotePricingModel());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuotePricingModel field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuotePricingModel() {
    return isSetField(42553);
  }

  public void set(quickfix.field.LegReturnRateCashFlowType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateCashFlowType get(quickfix.field.LegReturnRateCashFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateCashFlowType getLegReturnRateCashFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateCashFlowType());
  }

  public boolean isSet(quickfix.field.LegReturnRateCashFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateCashFlowType() {
    return isSetField(42554);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateDateGrp get(quickfix.fixlatest.component.LegReturnRateDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateDateGrp getLegReturnRateDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateDateGrp());
  }

  public void set(quickfix.field.NoLegReturnRateDates value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateDates get(quickfix.field.NoLegReturnRateDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateDates getNoLegReturnRateDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateDates());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateDates() {
    return isSetField(42508);
  }

public static class NoLegReturnRateDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42509, 42571, 42510, 42511, 42512, 42513, 42514, 42515, 42516, 42517, 42518, 42519, 42520, 42521, 42522, 42523, 42524, 42525, 42526, 42527, 42528, 42529, 42569, 0};

  public NoLegReturnRateDates() {
    super(42508, 42509, ORDER);
  }

  public void set(quickfix.field.LegReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateDateMode get(quickfix.field.LegReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateDateMode getLegReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.LegReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateDateMode() {
    return isSetField(42509);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateGrp get(quickfix.fixlatest.component.LegReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateGrp getLegReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoLegReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDates get(quickfix.field.NoLegReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDates getNoLegReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDates() {
    return isSetField(42571);
  }

public static class NoLegReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42572, 42573, 0};

  public NoLegReturnRateValuationDates() {
    super(42571, 42572, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDate get(quickfix.field.LegReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDate getLegReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDate() {
    return isSetField(42572);
  }

  public void set(quickfix.field.LegReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateType get(quickfix.field.LegReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateType getLegReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateType() {
    return isSetField(42573);
  }
}

  public void set(quickfix.field.LegReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateRelativeTo get(quickfix.field.LegReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateRelativeTo getLegReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateRelativeTo() {
    return isSetField(42510);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetPeriod get(quickfix.field.LegReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetPeriod getLegReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetPeriod() {
    return isSetField(42511);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetUnit get(quickfix.field.LegReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetUnit getLegReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetUnit() {
    return isSetField(42512);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetDayType get(quickfix.field.LegReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetDayType getLegReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetDayType() {
    return isSetField(42513);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateUnadjusted get(quickfix.field.LegReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateUnadjusted getLegReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateUnadjusted() {
    return isSetField(42514);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateRelativeTo get(quickfix.field.LegReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateRelativeTo getLegReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateRelativeTo() {
    return isSetField(42515);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetPeriod get(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetPeriod getLegReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(42516);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetUnit get(quickfix.field.LegReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetUnit getLegReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetUnit() {
    return isSetField(42517);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetDayType get(quickfix.field.LegReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetDayType getLegReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetDayType() {
    return isSetField(42518);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateAdjusted get(quickfix.field.LegReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateAdjusted getLegReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateAdjusted() {
    return isSetField(42519);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateUnadjusted get(quickfix.field.LegReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateUnadjusted getLegReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateUnadjusted() {
    return isSetField(42520);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateRelativeTo get(quickfix.field.LegReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateRelativeTo getLegReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateRelativeTo() {
    return isSetField(42521);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetPeriod get(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetPeriod getLegReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(42522);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetUnit get(quickfix.field.LegReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetUnit getLegReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetUnit() {
    return isSetField(42523);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetDayType get(quickfix.field.LegReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetDayType getLegReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetDayType() {
    return isSetField(42524);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateAdjusted get(quickfix.field.LegReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateAdjusted getLegReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateAdjusted() {
    return isSetField(42525);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyPeriod get(quickfix.field.LegReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyPeriod getLegReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyPeriod() {
    return isSetField(42526);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyUnit get(quickfix.field.LegReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyUnit getLegReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyUnit() {
    return isSetField(42527);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyRollConvention get(quickfix.field.LegReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyRollConvention getLegReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyRollConvention() {
    return isSetField(42528);
  }

  public void set(quickfix.field.LegReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessDayConvention get(quickfix.field.LegReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessDayConvention getLegReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessDayConvention() {
    return isSetField(42529);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp getLegReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters get(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters getNoLegReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDateBusinessCenters() {
    return isSetField(42569);
  }

public static class NoLegReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42570, 0};

  public NoLegReturnRateValuationDateBusinessCenters() {
    super(42569, 42570, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter get(quickfix.field.LegReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter getLegReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessCenter() {
    return isSetField(42570);
  }
}
}

  public void set(quickfix.field.LegReturnRateValuationTimeType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationTimeType get(quickfix.field.LegReturnRateValuationTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationTimeType getLegReturnRateValuationTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationTimeType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationTimeType() {
    return isSetField(42555);
  }

  public void set(quickfix.field.LegReturnRateValuationTime value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationTime get(quickfix.field.LegReturnRateValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationTime getLegReturnRateValuationTime() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationTime());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationTime() {
    return isSetField(42556);
  }

  public void set(quickfix.field.LegReturnRateValuationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationTimeBusinessCenter get(quickfix.field.LegReturnRateValuationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationTimeBusinessCenter getLegReturnRateValuationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationTimeBusinessCenter() {
    return isSetField(42557);
  }

  public void set(quickfix.field.LegReturnRateValuationPriceOption value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationPriceOption get(quickfix.field.LegReturnRateValuationPriceOption value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationPriceOption getLegReturnRateValuationPriceOption() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationPriceOption());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationPriceOption field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationPriceOption() {
    return isSetField(42558);
  }

  public void set(quickfix.field.LegReturnRateFinalPriceFallback value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFinalPriceFallback get(quickfix.field.LegReturnRateFinalPriceFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFinalPriceFallback getLegReturnRateFinalPriceFallback() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFinalPriceFallback());
  }

  public boolean isSet(quickfix.field.LegReturnRateFinalPriceFallback field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFinalPriceFallback() {
    return isSetField(42559);
  }
}

  public void set(quickfix.field.LegReturnRatePriceSequence value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceSequence get(quickfix.field.LegReturnRatePriceSequence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceSequence getLegReturnRatePriceSequence() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceSequence());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceSequence field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceSequence() {
    return isSetField(42535);
  }

  public void set(quickfix.field.LegReturnRateCommissionBasis value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateCommissionBasis get(quickfix.field.LegReturnRateCommissionBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateCommissionBasis getLegReturnRateCommissionBasis() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateCommissionBasis());
  }

  public boolean isSet(quickfix.field.LegReturnRateCommissionBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateCommissionBasis() {
    return isSetField(42536);
  }

  public void set(quickfix.field.LegReturnRateCommissionAmount value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateCommissionAmount get(quickfix.field.LegReturnRateCommissionAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateCommissionAmount getLegReturnRateCommissionAmount() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateCommissionAmount());
  }

  public boolean isSet(quickfix.field.LegReturnRateCommissionAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateCommissionAmount() {
    return isSetField(42537);
  }

  public void set(quickfix.field.LegReturnRateCommissionCurrency value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateCommissionCurrency get(quickfix.field.LegReturnRateCommissionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateCommissionCurrency getLegReturnRateCommissionCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateCommissionCurrency());
  }

  public boolean isSet(quickfix.field.LegReturnRateCommissionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateCommissionCurrency() {
    return isSetField(42538);
  }

  public void set(quickfix.field.LegReturnRateTotalCommissionPerTrade value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateTotalCommissionPerTrade get(quickfix.field.LegReturnRateTotalCommissionPerTrade value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateTotalCommissionPerTrade getLegReturnRateTotalCommissionPerTrade() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateTotalCommissionPerTrade());
  }

  public boolean isSet(quickfix.field.LegReturnRateTotalCommissionPerTrade field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateTotalCommissionPerTrade() {
    return isSetField(42539);
  }

  public void set(quickfix.field.LegReturnRateDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateDeterminationMethod get(quickfix.field.LegReturnRateDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateDeterminationMethod getLegReturnRateDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegReturnRateDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateDeterminationMethod() {
    return isSetField(42540);
  }

  public void set(quickfix.fixlatest.component.LegReturnRatePriceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRatePriceGrp get(quickfix.fixlatest.component.LegReturnRatePriceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRatePriceGrp getLegReturnRatePriceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRatePriceGrp());
  }

  public void set(quickfix.field.NoLegReturnRatePrices value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRatePrices get(quickfix.field.NoLegReturnRatePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRatePrices getNoLegReturnRatePrices() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRatePrices());
  }

  public boolean isSet(quickfix.field.NoLegReturnRatePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRatePrices() {
    return isSetField(42564);
  }

public static class NoLegReturnRatePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42565, 42566, 42567, 42568, 0};

  public NoLegReturnRatePrices() {
    super(42564, 42565, ORDER);
  }

  public void set(quickfix.field.LegReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceBasis get(quickfix.field.LegReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceBasis getLegReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceBasis() {
    return isSetField(42565);
  }

  public void set(quickfix.field.LegReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePrice get(quickfix.field.LegReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePrice getLegReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePrice());
  }

  public boolean isSet(quickfix.field.LegReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePrice() {
    return isSetField(42566);
  }

  public void set(quickfix.field.LegReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceCurrency get(quickfix.field.LegReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceCurrency getLegReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceCurrency() {
    return isSetField(42567);
  }

  public void set(quickfix.field.LegReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceType get(quickfix.field.LegReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceType getLegReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceType() {
    return isSetField(42568);
  }
}

  public void set(quickfix.fixlatest.component.LegReturnRateFXConversionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateFXConversionGrp get(quickfix.fixlatest.component.LegReturnRateFXConversionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateFXConversionGrp getLegReturnRateFXConversionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateFXConversionGrp());
  }

  public void set(quickfix.field.NoLegReturnRateFXConversions value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateFXConversions get(quickfix.field.NoLegReturnRateFXConversions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateFXConversions getNoLegReturnRateFXConversions() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateFXConversions());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateFXConversions field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateFXConversions() {
    return isSetField(42530);
  }

public static class NoLegReturnRateFXConversions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42531, 42532, 42533, 0};

  public NoLegReturnRateFXConversions() {
    super(42530, 42531, ORDER);
  }

  public void set(quickfix.field.LegReturnRateFXCurrencySymbol value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXCurrencySymbol get(quickfix.field.LegReturnRateFXCurrencySymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXCurrencySymbol getLegReturnRateFXCurrencySymbol() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXCurrencySymbol());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXCurrencySymbol field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXCurrencySymbol() {
    return isSetField(42531);
  }

  public void set(quickfix.field.LegReturnRateFXRate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXRate get(quickfix.field.LegReturnRateFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXRate getLegReturnRateFXRate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXRate());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXRate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXRate() {
    return isSetField(42532);
  }

  public void set(quickfix.field.LegReturnRateFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFXRateCalc get(quickfix.field.LegReturnRateFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFXRateCalc getLegReturnRateFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFXRateCalc());
  }

  public boolean isSet(quickfix.field.LegReturnRateFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFXRateCalc() {
    return isSetField(42533);
  }
}

  public void set(quickfix.field.LegReturnRateAmountRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateAmountRelativeTo get(quickfix.field.LegReturnRateAmountRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateAmountRelativeTo getLegReturnRateAmountRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateAmountRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateAmountRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateAmountRelativeTo() {
    return isSetField(42541);
  }

  public void set(quickfix.field.LegReturnRateQuoteMeasureType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteMeasureType get(quickfix.field.LegReturnRateQuoteMeasureType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteMeasureType getLegReturnRateQuoteMeasureType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteMeasureType());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteMeasureType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteMeasureType() {
    return isSetField(42542);
  }

  public void set(quickfix.field.LegReturnRateQuoteUnits value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteUnits get(quickfix.field.LegReturnRateQuoteUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteUnits getLegReturnRateQuoteUnits() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteUnits());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteUnits field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteUnits() {
    return isSetField(42543);
  }

  public void set(quickfix.field.LegReturnRateQuoteMethod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteMethod get(quickfix.field.LegReturnRateQuoteMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteMethod getLegReturnRateQuoteMethod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteMethod());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteMethod() {
    return isSetField(42544);
  }

  public void set(quickfix.field.LegReturnRateQuoteCurrency value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteCurrency get(quickfix.field.LegReturnRateQuoteCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteCurrency getLegReturnRateQuoteCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteCurrency());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteCurrency() {
    return isSetField(42545);
  }

  public void set(quickfix.field.LegReturnRateQuoteCurrencyType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteCurrencyType get(quickfix.field.LegReturnRateQuoteCurrencyType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteCurrencyType getLegReturnRateQuoteCurrencyType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteCurrencyType());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteCurrencyType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteCurrencyType() {
    return isSetField(42546);
  }

  public void set(quickfix.field.LegReturnRateQuoteTimeType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteTimeType get(quickfix.field.LegReturnRateQuoteTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteTimeType getLegReturnRateQuoteTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteTimeType());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteTimeType() {
    return isSetField(42547);
  }

  public void set(quickfix.field.LegReturnRateQuoteTime value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteTime get(quickfix.field.LegReturnRateQuoteTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteTime getLegReturnRateQuoteTime() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteTime());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteTime field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteTime() {
    return isSetField(42548);
  }

  public void set(quickfix.field.LegReturnRateQuoteDate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteDate get(quickfix.field.LegReturnRateQuoteDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteDate getLegReturnRateQuoteDate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteDate());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteDate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteDate() {
    return isSetField(42549);
  }

  public void set(quickfix.field.LegReturnRateQuoteExpirationTime value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteExpirationTime get(quickfix.field.LegReturnRateQuoteExpirationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteExpirationTime getLegReturnRateQuoteExpirationTime() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteExpirationTime());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteExpirationTime field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteExpirationTime() {
    return isSetField(42550);
  }

  public void set(quickfix.field.LegReturnRateQuoteBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteBusinessCenter get(quickfix.field.LegReturnRateQuoteBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteBusinessCenter getLegReturnRateQuoteBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteBusinessCenter() {
    return isSetField(42551);
  }

  public void set(quickfix.field.LegReturnRateQuoteExchange value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuoteExchange get(quickfix.field.LegReturnRateQuoteExchange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuoteExchange getLegReturnRateQuoteExchange() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuoteExchange());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuoteExchange field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuoteExchange() {
    return isSetField(42552);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateInformationSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateInformationSourceGrp get(quickfix.fixlatest.component.LegReturnRateInformationSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateInformationSourceGrp getLegReturnRateInformationSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateInformationSourceGrp());
  }

  public void set(quickfix.field.NoLegReturnRateInformationSources value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateInformationSources get(quickfix.field.NoLegReturnRateInformationSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateInformationSources getNoLegReturnRateInformationSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateInformationSources());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateInformationSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateInformationSources() {
    return isSetField(42560);
  }

public static class NoLegReturnRateInformationSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42561, 42562, 42563, 0};

  public NoLegReturnRateInformationSources() {
    super(42560, 42561, ORDER);
  }

  public void set(quickfix.field.LegReturnRateInformationSource value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateInformationSource get(quickfix.field.LegReturnRateInformationSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateInformationSource getLegReturnRateInformationSource() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateInformationSource());
  }

  public boolean isSet(quickfix.field.LegReturnRateInformationSource field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateInformationSource() {
    return isSetField(42561);
  }

  public void set(quickfix.field.LegReturnRateReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateReferencePage get(quickfix.field.LegReturnRateReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateReferencePage getLegReturnRateReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateReferencePage());
  }

  public boolean isSet(quickfix.field.LegReturnRateReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateReferencePage() {
    return isSetField(42562);
  }

  public void set(quickfix.field.LegReturnRateReferencePageHeading value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateReferencePageHeading get(quickfix.field.LegReturnRateReferencePageHeading value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateReferencePageHeading getLegReturnRateReferencePageHeading() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateReferencePageHeading());
  }

  public boolean isSet(quickfix.field.LegReturnRateReferencePageHeading field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateReferencePageHeading() {
    return isSetField(42563);
  }
}

  public void set(quickfix.field.LegReturnRateQuotePricingModel value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateQuotePricingModel get(quickfix.field.LegReturnRateQuotePricingModel value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateQuotePricingModel getLegReturnRateQuotePricingModel() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateQuotePricingModel());
  }

  public boolean isSet(quickfix.field.LegReturnRateQuotePricingModel field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateQuotePricingModel() {
    return isSetField(42553);
  }

  public void set(quickfix.field.LegReturnRateCashFlowType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateCashFlowType get(quickfix.field.LegReturnRateCashFlowType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateCashFlowType getLegReturnRateCashFlowType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateCashFlowType());
  }

  public boolean isSet(quickfix.field.LegReturnRateCashFlowType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateCashFlowType() {
    return isSetField(42554);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateDateGrp get(quickfix.fixlatest.component.LegReturnRateDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateDateGrp getLegReturnRateDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateDateGrp());
  }

  public void set(quickfix.field.NoLegReturnRateDates value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateDates get(quickfix.field.NoLegReturnRateDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateDates getNoLegReturnRateDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateDates());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateDates() {
    return isSetField(42508);
  }

public static class NoLegReturnRateDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42509, 42571, 42510, 42511, 42512, 42513, 42514, 42515, 42516, 42517, 42518, 42519, 42520, 42521, 42522, 42523, 42524, 42525, 42526, 42527, 42528, 42529, 42569, 0};

  public NoLegReturnRateDates() {
    super(42508, 42509, ORDER);
  }

  public void set(quickfix.field.LegReturnRateDateMode value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateDateMode get(quickfix.field.LegReturnRateDateMode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateDateMode getLegReturnRateDateMode() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateDateMode());
  }

  public boolean isSet(quickfix.field.LegReturnRateDateMode field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateDateMode() {
    return isSetField(42509);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateValuationDateGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateGrp get(quickfix.fixlatest.component.LegReturnRateValuationDateGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateGrp getLegReturnRateValuationDateGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateValuationDateGrp());
  }

  public void set(quickfix.field.NoLegReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDates get(quickfix.field.NoLegReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDates getNoLegReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDates() {
    return isSetField(42571);
  }

public static class NoLegReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42572, 42573, 0};

  public NoLegReturnRateValuationDates() {
    super(42571, 42572, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDate get(quickfix.field.LegReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDate getLegReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDate() {
    return isSetField(42572);
  }

  public void set(quickfix.field.LegReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateType get(quickfix.field.LegReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateType getLegReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateType() {
    return isSetField(42573);
  }
}

  public void set(quickfix.field.LegReturnRateValuationDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateRelativeTo get(quickfix.field.LegReturnRateValuationDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateRelativeTo getLegReturnRateValuationDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateRelativeTo() {
    return isSetField(42510);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetPeriod get(quickfix.field.LegReturnRateValuationDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetPeriod getLegReturnRateValuationDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetPeriod() {
    return isSetField(42511);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetUnit get(quickfix.field.LegReturnRateValuationDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetUnit getLegReturnRateValuationDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetUnit() {
    return isSetField(42512);
  }

  public void set(quickfix.field.LegReturnRateValuationDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateOffsetDayType get(quickfix.field.LegReturnRateValuationDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateOffsetDayType getLegReturnRateValuationDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateOffsetDayType() {
    return isSetField(42513);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateUnadjusted get(quickfix.field.LegReturnRateValuationStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateUnadjusted getLegReturnRateValuationStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateUnadjusted() {
    return isSetField(42514);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateRelativeTo get(quickfix.field.LegReturnRateValuationStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateRelativeTo getLegReturnRateValuationStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateRelativeTo() {
    return isSetField(42515);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetPeriod get(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetPeriod getLegReturnRateValuationStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetPeriod() {
    return isSetField(42516);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetUnit get(quickfix.field.LegReturnRateValuationStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetUnit getLegReturnRateValuationStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetUnit() {
    return isSetField(42517);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetDayType get(quickfix.field.LegReturnRateValuationStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateOffsetDayType getLegReturnRateValuationStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateOffsetDayType() {
    return isSetField(42518);
  }

  public void set(quickfix.field.LegReturnRateValuationStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationStartDateAdjusted get(quickfix.field.LegReturnRateValuationStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationStartDateAdjusted getLegReturnRateValuationStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationStartDateAdjusted() {
    return isSetField(42519);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateUnadjusted get(quickfix.field.LegReturnRateValuationEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateUnadjusted getLegReturnRateValuationEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateUnadjusted() {
    return isSetField(42520);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateRelativeTo get(quickfix.field.LegReturnRateValuationEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateRelativeTo getLegReturnRateValuationEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateRelativeTo() {
    return isSetField(42521);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetPeriod get(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetPeriod getLegReturnRateValuationEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetPeriod() {
    return isSetField(42522);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetUnit get(quickfix.field.LegReturnRateValuationEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetUnit getLegReturnRateValuationEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetUnit() {
    return isSetField(42523);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetDayType get(quickfix.field.LegReturnRateValuationEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateOffsetDayType getLegReturnRateValuationEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateOffsetDayType() {
    return isSetField(42524);
  }

  public void set(quickfix.field.LegReturnRateValuationEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationEndDateAdjusted get(quickfix.field.LegReturnRateValuationEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationEndDateAdjusted getLegReturnRateValuationEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationEndDateAdjusted() {
    return isSetField(42525);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyPeriod value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyPeriod get(quickfix.field.LegReturnRateValuationFrequencyPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyPeriod getLegReturnRateValuationFrequencyPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyPeriod());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyPeriod() {
    return isSetField(42526);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyUnit value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyUnit get(quickfix.field.LegReturnRateValuationFrequencyUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyUnit getLegReturnRateValuationFrequencyUnit() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyUnit());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyUnit() {
    return isSetField(42527);
  }

  public void set(quickfix.field.LegReturnRateValuationFrequencyRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationFrequencyRollConvention get(quickfix.field.LegReturnRateValuationFrequencyRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationFrequencyRollConvention getLegReturnRateValuationFrequencyRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationFrequencyRollConvention());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationFrequencyRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationFrequencyRollConvention() {
    return isSetField(42528);
  }

  public void set(quickfix.field.LegReturnRateValuationDateBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessDayConvention get(quickfix.field.LegReturnRateValuationDateBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessDayConvention getLegReturnRateValuationDateBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessDayConvention() {
    return isSetField(42529);
  }

  public void set(quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp get(quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp getLegReturnRateValuationDateBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegReturnRateValuationDateBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters get(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters getNoLegReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDateBusinessCenters() {
    return isSetField(42569);
  }

public static class NoLegReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42570, 0};

  public NoLegReturnRateValuationDateBusinessCenters() {
    super(42569, 42570, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter get(quickfix.field.LegReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter getLegReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessCenter() {
    return isSetField(42570);
  }
}
}

  public void set(quickfix.field.LegReturnRateValuationTimeType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationTimeType get(quickfix.field.LegReturnRateValuationTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationTimeType getLegReturnRateValuationTimeType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationTimeType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationTimeType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationTimeType() {
    return isSetField(42555);
  }

  public void set(quickfix.field.LegReturnRateValuationTime value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationTime get(quickfix.field.LegReturnRateValuationTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationTime getLegReturnRateValuationTime() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationTime());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationTime field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationTime() {
    return isSetField(42556);
  }

  public void set(quickfix.field.LegReturnRateValuationTimeBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationTimeBusinessCenter get(quickfix.field.LegReturnRateValuationTimeBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationTimeBusinessCenter getLegReturnRateValuationTimeBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationTimeBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationTimeBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationTimeBusinessCenter() {
    return isSetField(42557);
  }

  public void set(quickfix.field.LegReturnRateValuationPriceOption value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationPriceOption get(quickfix.field.LegReturnRateValuationPriceOption value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationPriceOption getLegReturnRateValuationPriceOption() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationPriceOption());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationPriceOption field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationPriceOption() {
    return isSetField(42558);
  }

  public void set(quickfix.field.LegReturnRateFinalPriceFallback value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateFinalPriceFallback get(quickfix.field.LegReturnRateFinalPriceFallback value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateFinalPriceFallback getLegReturnRateFinalPriceFallback() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateFinalPriceFallback());
  }

  public boolean isSet(quickfix.field.LegReturnRateFinalPriceFallback field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateFinalPriceFallback() {
    return isSetField(42559);
  }
}
