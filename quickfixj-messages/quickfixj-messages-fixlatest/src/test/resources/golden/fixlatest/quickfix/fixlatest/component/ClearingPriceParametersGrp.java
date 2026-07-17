/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ClearingPriceParametersGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2580, };
  protected int[] getGroupFields() { return componentGroups; }

  public ClearingPriceParametersGrp() {
    super();
  }

  public void set(quickfix.field.NoClearingPriceParameters value) {
    setField(value);
  }

  public quickfix.field.NoClearingPriceParameters get(quickfix.field.NoClearingPriceParameters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingPriceParameters getNoClearingPriceParameters() throws FieldNotFound {
    return get(new quickfix.field.NoClearingPriceParameters());
  }

  public boolean isSet(quickfix.field.NoClearingPriceParameters field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingPriceParameters() {
    return isSetField(2580);
  }

public static class NoClearingPriceParameters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2581, 2582, 2583, 2584, 2585, 2586, 2588, 2587, 2589, 1190, 2590, 2591, 1592, 1188, 2528, 2592, 0};

  public NoClearingPriceParameters() {
    super(2580, 2581, ORDER);
  }

  public void set(quickfix.field.BusinessDayType value) {
    setField(value);
  }

  public quickfix.field.BusinessDayType get(quickfix.field.BusinessDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BusinessDayType getBusinessDayType() throws FieldNotFound {
    return get(new quickfix.field.BusinessDayType());
  }

  public boolean isSet(quickfix.field.BusinessDayType field) {
    return isSetField(field);
  }

  public boolean isSetBusinessDayType() {
    return isSetField(2581);
  }

  public void set(quickfix.field.ClearingPriceOffset value) {
    setField(value);
  }

  public quickfix.field.ClearingPriceOffset get(quickfix.field.ClearingPriceOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingPriceOffset getClearingPriceOffset() throws FieldNotFound {
    return get(new quickfix.field.ClearingPriceOffset());
  }

  public boolean isSet(quickfix.field.ClearingPriceOffset field) {
    return isSetField(field);
  }

  public boolean isSetClearingPriceOffset() {
    return isSetField(2582);
  }

  public void set(quickfix.field.VegaMultiplier value) {
    setField(value);
  }

  public quickfix.field.VegaMultiplier get(quickfix.field.VegaMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VegaMultiplier getVegaMultiplier() throws FieldNotFound {
    return get(new quickfix.field.VegaMultiplier());
  }

  public boolean isSet(quickfix.field.VegaMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetVegaMultiplier() {
    return isSetField(2583);
  }

  public void set(quickfix.field.AnnualTradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.AnnualTradingBusinessDays get(quickfix.field.AnnualTradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AnnualTradingBusinessDays getAnnualTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.AnnualTradingBusinessDays());
  }

  public boolean isSet(quickfix.field.AnnualTradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetAnnualTradingBusinessDays() {
    return isSetField(2584);
  }

  public void set(quickfix.field.TotalTradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.TotalTradingBusinessDays get(quickfix.field.TotalTradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalTradingBusinessDays getTotalTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.TotalTradingBusinessDays());
  }

  public boolean isSet(quickfix.field.TotalTradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetTotalTradingBusinessDays() {
    return isSetField(2585);
  }

  public void set(quickfix.field.TradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.TradingBusinessDays get(quickfix.field.TradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingBusinessDays getTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.TradingBusinessDays());
  }

  public boolean isSet(quickfix.field.TradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetTradingBusinessDays() {
    return isSetField(2586);
  }

  public void set(quickfix.field.StandardVariance value) {
    setField(value);
  }

  public quickfix.field.StandardVariance get(quickfix.field.StandardVariance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StandardVariance getStandardVariance() throws FieldNotFound {
    return get(new quickfix.field.StandardVariance());
  }

  public boolean isSet(quickfix.field.StandardVariance field) {
    return isSetField(field);
  }

  public boolean isSetStandardVariance() {
    return isSetField(2588);
  }

  public void set(quickfix.field.RealizedVariance value) {
    setField(value);
  }

  public quickfix.field.RealizedVariance get(quickfix.field.RealizedVariance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RealizedVariance getRealizedVariance() throws FieldNotFound {
    return get(new quickfix.field.RealizedVariance());
  }

  public boolean isSet(quickfix.field.RealizedVariance field) {
    return isSetField(field);
  }

  public boolean isSetRealizedVariance() {
    return isSetField(2587);
  }

  public void set(quickfix.field.RelatedClosePrice value) {
    setField(value);
  }

  public quickfix.field.RelatedClosePrice get(quickfix.field.RelatedClosePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedClosePrice getRelatedClosePrice() throws FieldNotFound {
    return get(new quickfix.field.RelatedClosePrice());
  }

  public boolean isSet(quickfix.field.RelatedClosePrice field) {
    return isSetField(field);
  }

  public boolean isSetRelatedClosePrice() {
    return isSetField(2589);
  }

  public void set(quickfix.field.RiskFreeRate value) {
    setField(value);
  }

  public quickfix.field.RiskFreeRate get(quickfix.field.RiskFreeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskFreeRate getRiskFreeRate() throws FieldNotFound {
    return get(new quickfix.field.RiskFreeRate());
  }

  public boolean isSet(quickfix.field.RiskFreeRate field) {
    return isSetField(field);
  }

  public boolean isSetRiskFreeRate() {
    return isSetField(1190);
  }

  public void set(quickfix.field.OvernightInterestRate value) {
    setField(value);
  }

  public quickfix.field.OvernightInterestRate get(quickfix.field.OvernightInterestRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OvernightInterestRate getOvernightInterestRate() throws FieldNotFound {
    return get(new quickfix.field.OvernightInterestRate());
  }

  public boolean isSet(quickfix.field.OvernightInterestRate field) {
    return isSetField(field);
  }

  public boolean isSetOvernightInterestRate() {
    return isSetField(2590);
  }

  public void set(quickfix.field.AccumulatedReturnModifiedVariationMargin value) {
    setField(value);
  }

  public quickfix.field.AccumulatedReturnModifiedVariationMargin get(quickfix.field.AccumulatedReturnModifiedVariationMargin value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccumulatedReturnModifiedVariationMargin getAccumulatedReturnModifiedVariationMargin() throws FieldNotFound {
    return get(new quickfix.field.AccumulatedReturnModifiedVariationMargin());
  }

  public boolean isSet(quickfix.field.AccumulatedReturnModifiedVariationMargin field) {
    return isSetField(field);
  }

  public boolean isSetAccumulatedReturnModifiedVariationMargin() {
    return isSetField(2591);
  }

  public void set(quickfix.field.DiscountFactor value) {
    setField(value);
  }

  public quickfix.field.DiscountFactor get(quickfix.field.DiscountFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DiscountFactor getDiscountFactor() throws FieldNotFound {
    return get(new quickfix.field.DiscountFactor());
  }

  public boolean isSet(quickfix.field.DiscountFactor field) {
    return isSetField(field);
  }

  public boolean isSetDiscountFactor() {
    return isSetField(1592);
  }

  public void set(quickfix.field.Volatility value) {
    setField(value);
  }

  public quickfix.field.Volatility get(quickfix.field.Volatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Volatility getVolatility() throws FieldNotFound {
    return get(new quickfix.field.Volatility());
  }

  public boolean isSet(quickfix.field.Volatility field) {
    return isSetField(field);
  }

  public boolean isSetVolatility() {
    return isSetField(1188);
  }

  public void set(quickfix.field.ClearingSettlPrice value) {
    setField(value);
  }

  public quickfix.field.ClearingSettlPrice get(quickfix.field.ClearingSettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingSettlPrice getClearingSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.ClearingSettlPrice());
  }

  public boolean isSet(quickfix.field.ClearingSettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetClearingSettlPrice() {
    return isSetField(2528);
  }

  public void set(quickfix.field.CalculationMethod value) {
    setField(value);
  }

  public quickfix.field.CalculationMethod get(quickfix.field.CalculationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CalculationMethod getCalculationMethod() throws FieldNotFound {
    return get(new quickfix.field.CalculationMethod());
  }

  public boolean isSet(quickfix.field.CalculationMethod field) {
    return isSetField(field);
  }

  public boolean isSetCalculationMethod() {
    return isSetField(2592);
  }
}

  public void set(quickfix.field.BusinessDayType value) {
    setField(value);
  }

  public quickfix.field.BusinessDayType get(quickfix.field.BusinessDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BusinessDayType getBusinessDayType() throws FieldNotFound {
    return get(new quickfix.field.BusinessDayType());
  }

  public boolean isSet(quickfix.field.BusinessDayType field) {
    return isSetField(field);
  }

  public boolean isSetBusinessDayType() {
    return isSetField(2581);
  }

  public void set(quickfix.field.ClearingPriceOffset value) {
    setField(value);
  }

  public quickfix.field.ClearingPriceOffset get(quickfix.field.ClearingPriceOffset value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingPriceOffset getClearingPriceOffset() throws FieldNotFound {
    return get(new quickfix.field.ClearingPriceOffset());
  }

  public boolean isSet(quickfix.field.ClearingPriceOffset field) {
    return isSetField(field);
  }

  public boolean isSetClearingPriceOffset() {
    return isSetField(2582);
  }

  public void set(quickfix.field.VegaMultiplier value) {
    setField(value);
  }

  public quickfix.field.VegaMultiplier get(quickfix.field.VegaMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.VegaMultiplier getVegaMultiplier() throws FieldNotFound {
    return get(new quickfix.field.VegaMultiplier());
  }

  public boolean isSet(quickfix.field.VegaMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetVegaMultiplier() {
    return isSetField(2583);
  }

  public void set(quickfix.field.AnnualTradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.AnnualTradingBusinessDays get(quickfix.field.AnnualTradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AnnualTradingBusinessDays getAnnualTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.AnnualTradingBusinessDays());
  }

  public boolean isSet(quickfix.field.AnnualTradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetAnnualTradingBusinessDays() {
    return isSetField(2584);
  }

  public void set(quickfix.field.TotalTradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.TotalTradingBusinessDays get(quickfix.field.TotalTradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalTradingBusinessDays getTotalTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.TotalTradingBusinessDays());
  }

  public boolean isSet(quickfix.field.TotalTradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetTotalTradingBusinessDays() {
    return isSetField(2585);
  }

  public void set(quickfix.field.TradingBusinessDays value) {
    setField(value);
  }

  public quickfix.field.TradingBusinessDays get(quickfix.field.TradingBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingBusinessDays getTradingBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.TradingBusinessDays());
  }

  public boolean isSet(quickfix.field.TradingBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetTradingBusinessDays() {
    return isSetField(2586);
  }

  public void set(quickfix.field.StandardVariance value) {
    setField(value);
  }

  public quickfix.field.StandardVariance get(quickfix.field.StandardVariance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StandardVariance getStandardVariance() throws FieldNotFound {
    return get(new quickfix.field.StandardVariance());
  }

  public boolean isSet(quickfix.field.StandardVariance field) {
    return isSetField(field);
  }

  public boolean isSetStandardVariance() {
    return isSetField(2588);
  }

  public void set(quickfix.field.RealizedVariance value) {
    setField(value);
  }

  public quickfix.field.RealizedVariance get(quickfix.field.RealizedVariance value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RealizedVariance getRealizedVariance() throws FieldNotFound {
    return get(new quickfix.field.RealizedVariance());
  }

  public boolean isSet(quickfix.field.RealizedVariance field) {
    return isSetField(field);
  }

  public boolean isSetRealizedVariance() {
    return isSetField(2587);
  }

  public void set(quickfix.field.RelatedClosePrice value) {
    setField(value);
  }

  public quickfix.field.RelatedClosePrice get(quickfix.field.RelatedClosePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedClosePrice getRelatedClosePrice() throws FieldNotFound {
    return get(new quickfix.field.RelatedClosePrice());
  }

  public boolean isSet(quickfix.field.RelatedClosePrice field) {
    return isSetField(field);
  }

  public boolean isSetRelatedClosePrice() {
    return isSetField(2589);
  }

  public void set(quickfix.field.RiskFreeRate value) {
    setField(value);
  }

  public quickfix.field.RiskFreeRate get(quickfix.field.RiskFreeRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskFreeRate getRiskFreeRate() throws FieldNotFound {
    return get(new quickfix.field.RiskFreeRate());
  }

  public boolean isSet(quickfix.field.RiskFreeRate field) {
    return isSetField(field);
  }

  public boolean isSetRiskFreeRate() {
    return isSetField(1190);
  }

  public void set(quickfix.field.OvernightInterestRate value) {
    setField(value);
  }

  public quickfix.field.OvernightInterestRate get(quickfix.field.OvernightInterestRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OvernightInterestRate getOvernightInterestRate() throws FieldNotFound {
    return get(new quickfix.field.OvernightInterestRate());
  }

  public boolean isSet(quickfix.field.OvernightInterestRate field) {
    return isSetField(field);
  }

  public boolean isSetOvernightInterestRate() {
    return isSetField(2590);
  }

  public void set(quickfix.field.AccumulatedReturnModifiedVariationMargin value) {
    setField(value);
  }

  public quickfix.field.AccumulatedReturnModifiedVariationMargin get(quickfix.field.AccumulatedReturnModifiedVariationMargin value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccumulatedReturnModifiedVariationMargin getAccumulatedReturnModifiedVariationMargin() throws FieldNotFound {
    return get(new quickfix.field.AccumulatedReturnModifiedVariationMargin());
  }

  public boolean isSet(quickfix.field.AccumulatedReturnModifiedVariationMargin field) {
    return isSetField(field);
  }

  public boolean isSetAccumulatedReturnModifiedVariationMargin() {
    return isSetField(2591);
  }

  public void set(quickfix.field.DiscountFactor value) {
    setField(value);
  }

  public quickfix.field.DiscountFactor get(quickfix.field.DiscountFactor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DiscountFactor getDiscountFactor() throws FieldNotFound {
    return get(new quickfix.field.DiscountFactor());
  }

  public boolean isSet(quickfix.field.DiscountFactor field) {
    return isSetField(field);
  }

  public boolean isSetDiscountFactor() {
    return isSetField(1592);
  }

  public void set(quickfix.field.Volatility value) {
    setField(value);
  }

  public quickfix.field.Volatility get(quickfix.field.Volatility value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Volatility getVolatility() throws FieldNotFound {
    return get(new quickfix.field.Volatility());
  }

  public boolean isSet(quickfix.field.Volatility field) {
    return isSetField(field);
  }

  public boolean isSetVolatility() {
    return isSetField(1188);
  }

  public void set(quickfix.field.ClearingSettlPrice value) {
    setField(value);
  }

  public quickfix.field.ClearingSettlPrice get(quickfix.field.ClearingSettlPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingSettlPrice getClearingSettlPrice() throws FieldNotFound {
    return get(new quickfix.field.ClearingSettlPrice());
  }

  public boolean isSet(quickfix.field.ClearingSettlPrice field) {
    return isSetField(field);
  }

  public boolean isSetClearingSettlPrice() {
    return isSetField(2528);
  }

  public void set(quickfix.field.CalculationMethod value) {
    setField(value);
  }

  public quickfix.field.CalculationMethod get(quickfix.field.CalculationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CalculationMethod getCalculationMethod() throws FieldNotFound {
    return get(new quickfix.field.CalculationMethod());
  }

  public boolean isSet(quickfix.field.CalculationMethod field) {
    return isSetField(field);
  }

  public boolean isSetCalculationMethod() {
    return isSetField(2592);
  }
}
