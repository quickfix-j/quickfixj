/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class CollateralAmountGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1703, };
  protected int[] getGroupFields() { return componentGroups; }

  public CollateralAmountGrp() {
    super();
  }

  public void set(quickfix.field.NoCollateralAmounts value) {
    setField(value);
  }

  public quickfix.field.NoCollateralAmounts get(quickfix.field.NoCollateralAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCollateralAmounts getNoCollateralAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoCollateralAmounts());
  }

  public boolean isSet(quickfix.field.NoCollateralAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoCollateralAmounts() {
    return isSetField(1703);
  }

public static class NoCollateralAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1704, 1705, 2632, 2090, 2091, 1706, 2092, 2093, 1902, 2350, 2690, 2689, 2840, 2841, 0};

  public NoCollateralAmounts() {
    super(1703, 1704, ORDER);
  }

  public void set(quickfix.field.CurrentCollateralAmount value) {
    setField(value);
  }

  public quickfix.field.CurrentCollateralAmount get(quickfix.field.CurrentCollateralAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCollateralAmount getCurrentCollateralAmount() throws FieldNotFound {
    return get(new quickfix.field.CurrentCollateralAmount());
  }

  public boolean isSet(quickfix.field.CurrentCollateralAmount field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCollateralAmount() {
    return isSetField(1704);
  }

  public void set(quickfix.field.CollateralCurrency value) {
    setField(value);
  }

  public quickfix.field.CollateralCurrency get(quickfix.field.CollateralCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralCurrency getCollateralCurrency() throws FieldNotFound {
    return get(new quickfix.field.CollateralCurrency());
  }

  public boolean isSet(quickfix.field.CollateralCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCollateralCurrency() {
    return isSetField(1705);
  }

  public void set(quickfix.field.CollateralAmountType value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountType get(quickfix.field.CollateralAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountType getCollateralAmountType() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountType());
  }

  public boolean isSet(quickfix.field.CollateralAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountType() {
    return isSetField(2632);
  }

  public void set(quickfix.field.CollateralFXRate value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRate get(quickfix.field.CollateralFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRate getCollateralFXRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRate());
  }

  public boolean isSet(quickfix.field.CollateralFXRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRate() {
    return isSetField(2090);
  }

  public void set(quickfix.field.CollateralFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRateCalc get(quickfix.field.CollateralFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRateCalc getCollateralFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRateCalc());
  }

  public boolean isSet(quickfix.field.CollateralFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRateCalc() {
    return isSetField(2091);
  }

  public void set(quickfix.field.CollateralType value) {
    setField(value);
  }

  public quickfix.field.CollateralType get(quickfix.field.CollateralType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralType getCollateralType() throws FieldNotFound {
    return get(new quickfix.field.CollateralType());
  }

  public boolean isSet(quickfix.field.CollateralType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralType() {
    return isSetField(1706);
  }

  public void set(quickfix.field.CollateralAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketSegmentID get(quickfix.field.CollateralAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketSegmentID getCollateralAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketSegmentID() {
    return isSetField(2092);
  }

  public void set(quickfix.field.CollateralAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketID get(quickfix.field.CollateralAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketID getCollateralAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketID() {
    return isSetField(2093);
  }

  public void set(quickfix.field.HaircutIndicator value) {
    setField(value);
  }

  public quickfix.field.HaircutIndicator get(quickfix.field.HaircutIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HaircutIndicator getHaircutIndicator() throws FieldNotFound {
    return get(new quickfix.field.HaircutIndicator());
  }

  public boolean isSet(quickfix.field.HaircutIndicator field) {
    return isSetField(field);
  }

  public boolean isSetHaircutIndicator() {
    return isSetField(1902);
  }

  public void set(quickfix.field.CollateralPortfolioID value) {
    setField(value);
  }

  public quickfix.field.CollateralPortfolioID get(quickfix.field.CollateralPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPortfolioID getCollateralPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.CollateralPortfolioID());
  }

  public boolean isSet(quickfix.field.CollateralPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPortfolioID() {
    return isSetField(2350);
  }

  public void set(quickfix.field.CollateralPercentOverage value) {
    setField(value);
  }

  public quickfix.field.CollateralPercentOverage get(quickfix.field.CollateralPercentOverage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPercentOverage getCollateralPercentOverage() throws FieldNotFound {
    return get(new quickfix.field.CollateralPercentOverage());
  }

  public boolean isSet(quickfix.field.CollateralPercentOverage field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPercentOverage() {
    return isSetField(2690);
  }

  public void set(quickfix.field.CollateralMarketPrice value) {
    setField(value);
  }

  public quickfix.field.CollateralMarketPrice get(quickfix.field.CollateralMarketPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralMarketPrice getCollateralMarketPrice() throws FieldNotFound {
    return get(new quickfix.field.CollateralMarketPrice());
  }

  public boolean isSet(quickfix.field.CollateralMarketPrice field) {
    return isSetField(field);
  }

  public boolean isSetCollateralMarketPrice() {
    return isSetField(2689);
  }

  public void set(quickfix.field.CollateralReinvestmentRate value) {
    setField(value);
  }

  public quickfix.field.CollateralReinvestmentRate get(quickfix.field.CollateralReinvestmentRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralReinvestmentRate getCollateralReinvestmentRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralReinvestmentRate());
  }

  public boolean isSet(quickfix.field.CollateralReinvestmentRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralReinvestmentRate() {
    return isSetField(2840);
  }

  public void set(quickfix.field.UnderlyingRefID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRefID get(quickfix.field.UnderlyingRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRefID getUnderlyingRefID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRefID());
  }

  public boolean isSet(quickfix.field.UnderlyingRefID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRefID() {
    return isSetField(2841);
  }
}

  public void set(quickfix.field.CurrentCollateralAmount value) {
    setField(value);
  }

  public quickfix.field.CurrentCollateralAmount get(quickfix.field.CurrentCollateralAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCollateralAmount getCurrentCollateralAmount() throws FieldNotFound {
    return get(new quickfix.field.CurrentCollateralAmount());
  }

  public boolean isSet(quickfix.field.CurrentCollateralAmount field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCollateralAmount() {
    return isSetField(1704);
  }

  public void set(quickfix.field.CollateralCurrency value) {
    setField(value);
  }

  public quickfix.field.CollateralCurrency get(quickfix.field.CollateralCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralCurrency getCollateralCurrency() throws FieldNotFound {
    return get(new quickfix.field.CollateralCurrency());
  }

  public boolean isSet(quickfix.field.CollateralCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCollateralCurrency() {
    return isSetField(1705);
  }

  public void set(quickfix.field.CollateralAmountType value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountType get(quickfix.field.CollateralAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountType getCollateralAmountType() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountType());
  }

  public boolean isSet(quickfix.field.CollateralAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountType() {
    return isSetField(2632);
  }

  public void set(quickfix.field.CollateralFXRate value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRate get(quickfix.field.CollateralFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRate getCollateralFXRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRate());
  }

  public boolean isSet(quickfix.field.CollateralFXRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRate() {
    return isSetField(2090);
  }

  public void set(quickfix.field.CollateralFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRateCalc get(quickfix.field.CollateralFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRateCalc getCollateralFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRateCalc());
  }

  public boolean isSet(quickfix.field.CollateralFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRateCalc() {
    return isSetField(2091);
  }

  public void set(quickfix.field.CollateralType value) {
    setField(value);
  }

  public quickfix.field.CollateralType get(quickfix.field.CollateralType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralType getCollateralType() throws FieldNotFound {
    return get(new quickfix.field.CollateralType());
  }

  public boolean isSet(quickfix.field.CollateralType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralType() {
    return isSetField(1706);
  }

  public void set(quickfix.field.CollateralAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketSegmentID get(quickfix.field.CollateralAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketSegmentID getCollateralAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketSegmentID() {
    return isSetField(2092);
  }

  public void set(quickfix.field.CollateralAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketID get(quickfix.field.CollateralAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketID getCollateralAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketID() {
    return isSetField(2093);
  }

  public void set(quickfix.field.HaircutIndicator value) {
    setField(value);
  }

  public quickfix.field.HaircutIndicator get(quickfix.field.HaircutIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HaircutIndicator getHaircutIndicator() throws FieldNotFound {
    return get(new quickfix.field.HaircutIndicator());
  }

  public boolean isSet(quickfix.field.HaircutIndicator field) {
    return isSetField(field);
  }

  public boolean isSetHaircutIndicator() {
    return isSetField(1902);
  }

  public void set(quickfix.field.CollateralPortfolioID value) {
    setField(value);
  }

  public quickfix.field.CollateralPortfolioID get(quickfix.field.CollateralPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPortfolioID getCollateralPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.CollateralPortfolioID());
  }

  public boolean isSet(quickfix.field.CollateralPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPortfolioID() {
    return isSetField(2350);
  }

  public void set(quickfix.field.CollateralPercentOverage value) {
    setField(value);
  }

  public quickfix.field.CollateralPercentOverage get(quickfix.field.CollateralPercentOverage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPercentOverage getCollateralPercentOverage() throws FieldNotFound {
    return get(new quickfix.field.CollateralPercentOverage());
  }

  public boolean isSet(quickfix.field.CollateralPercentOverage field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPercentOverage() {
    return isSetField(2690);
  }

  public void set(quickfix.field.CollateralMarketPrice value) {
    setField(value);
  }

  public quickfix.field.CollateralMarketPrice get(quickfix.field.CollateralMarketPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralMarketPrice getCollateralMarketPrice() throws FieldNotFound {
    return get(new quickfix.field.CollateralMarketPrice());
  }

  public boolean isSet(quickfix.field.CollateralMarketPrice field) {
    return isSetField(field);
  }

  public boolean isSetCollateralMarketPrice() {
    return isSetField(2689);
  }

  public void set(quickfix.field.CollateralReinvestmentRate value) {
    setField(value);
  }

  public quickfix.field.CollateralReinvestmentRate get(quickfix.field.CollateralReinvestmentRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralReinvestmentRate getCollateralReinvestmentRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralReinvestmentRate());
  }

  public boolean isSet(quickfix.field.CollateralReinvestmentRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralReinvestmentRate() {
    return isSetField(2840);
  }

  public void set(quickfix.field.UnderlyingRefID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRefID get(quickfix.field.UnderlyingRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRefID getUnderlyingRefID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRefID());
  }

  public boolean isSet(quickfix.field.UnderlyingRefID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRefID() {
    return isSetField(2841);
  }
}
