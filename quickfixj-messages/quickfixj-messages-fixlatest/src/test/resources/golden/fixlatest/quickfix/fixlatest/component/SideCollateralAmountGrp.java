/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SideCollateralAmountGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2691, };
  protected int[] getGroupFields() { return componentGroups; }

  public SideCollateralAmountGrp() {
    super();
  }

  public void set(quickfix.field.NoSideCollateralAmounts value) {
    setField(value);
  }

  public quickfix.field.NoSideCollateralAmounts get(quickfix.field.NoSideCollateralAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideCollateralAmounts getNoSideCollateralAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoSideCollateralAmounts());
  }

  public boolean isSet(quickfix.field.NoSideCollateralAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoSideCollateralAmounts() {
    return isSetField(2691);
  }

public static class NoSideCollateralAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2702, 2695, 2694, 2696, 2697, 2701, 2693, 2692, 2703, 2700, 2699, 2698, 2862, 2864, 2863, 0};

  public NoSideCollateralAmounts() {
    super(2691, 2702, ORDER);
  }

  public void set(quickfix.field.SideCurrentCollateralAmount value) {
    setField(value);
  }

  public quickfix.field.SideCurrentCollateralAmount get(quickfix.field.SideCurrentCollateralAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCurrentCollateralAmount getSideCurrentCollateralAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCurrentCollateralAmount());
  }

  public boolean isSet(quickfix.field.SideCurrentCollateralAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCurrentCollateralAmount() {
    return isSetField(2702);
  }

  public void set(quickfix.field.SideCollateralCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralCurrency get(quickfix.field.SideCollateralCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralCurrency getSideCollateralCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralCurrency() {
    return isSetField(2695);
  }

  public void set(quickfix.field.SideCollateralAmountType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountType get(quickfix.field.SideCollateralAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountType getSideCollateralAmountType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountType());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountType() {
    return isSetField(2694);
  }

  public void set(quickfix.field.SideCollateralFXRate value) {
    setField(value);
  }

  public quickfix.field.SideCollateralFXRate get(quickfix.field.SideCollateralFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralFXRate getSideCollateralFXRate() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralFXRate());
  }

  public boolean isSet(quickfix.field.SideCollateralFXRate field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralFXRate() {
    return isSetField(2696);
  }

  public void set(quickfix.field.SideCollateralFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.SideCollateralFXRateCalc get(quickfix.field.SideCollateralFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralFXRateCalc getSideCollateralFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralFXRateCalc());
  }

  public boolean isSet(quickfix.field.SideCollateralFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralFXRateCalc() {
    return isSetField(2697);
  }

  public void set(quickfix.field.SideCollateralType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralType get(quickfix.field.SideCollateralType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralType getSideCollateralType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralType());
  }

  public boolean isSet(quickfix.field.SideCollateralType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralType() {
    return isSetField(2701);
  }

  public void set(quickfix.field.SideCollateralAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountMarketSegmentID get(quickfix.field.SideCollateralAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountMarketSegmentID getSideCollateralAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountMarketSegmentID() {
    return isSetField(2693);
  }

  public void set(quickfix.field.SideCollateralAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountMarketID get(quickfix.field.SideCollateralAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountMarketID getSideCollateralAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountMarketID());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountMarketID() {
    return isSetField(2692);
  }

  public void set(quickfix.field.SideHaircutIndicator value) {
    setField(value);
  }

  public quickfix.field.SideHaircutIndicator get(quickfix.field.SideHaircutIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideHaircutIndicator getSideHaircutIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideHaircutIndicator());
  }

  public boolean isSet(quickfix.field.SideHaircutIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideHaircutIndicator() {
    return isSetField(2703);
  }

  public void set(quickfix.field.SideCollateralPortfolioID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralPortfolioID get(quickfix.field.SideCollateralPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralPortfolioID getSideCollateralPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralPortfolioID());
  }

  public boolean isSet(quickfix.field.SideCollateralPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralPortfolioID() {
    return isSetField(2700);
  }

  public void set(quickfix.field.SideCollateralPercentOverage value) {
    setField(value);
  }

  public quickfix.field.SideCollateralPercentOverage get(quickfix.field.SideCollateralPercentOverage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralPercentOverage getSideCollateralPercentOverage() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralPercentOverage());
  }

  public boolean isSet(quickfix.field.SideCollateralPercentOverage field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralPercentOverage() {
    return isSetField(2699);
  }

  public void set(quickfix.field.SideCollateralMarketPrice value) {
    setField(value);
  }

  public quickfix.field.SideCollateralMarketPrice get(quickfix.field.SideCollateralMarketPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralMarketPrice getSideCollateralMarketPrice() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralMarketPrice());
  }

  public boolean isSet(quickfix.field.SideCollateralMarketPrice field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralMarketPrice() {
    return isSetField(2698);
  }

  public void set(quickfix.field.SideCollateralReinvestmentRate value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentRate get(quickfix.field.SideCollateralReinvestmentRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentRate getSideCollateralReinvestmentRate() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentRate());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentRate field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentRate() {
    return isSetField(2862);
  }

  public void set(quickfix.fixlatest.component.SideCollateralReinvestmentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCollateralReinvestmentGrp get(quickfix.fixlatest.component.SideCollateralReinvestmentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCollateralReinvestmentGrp getSideCollateralReinvestmentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCollateralReinvestmentGrp());
  }

  public void set(quickfix.field.NoSideCollateralReinvestments value) {
    setField(value);
  }

  public quickfix.field.NoSideCollateralReinvestments get(quickfix.field.NoSideCollateralReinvestments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideCollateralReinvestments getNoSideCollateralReinvestments() throws FieldNotFound {
    return get(new quickfix.field.NoSideCollateralReinvestments());
  }

  public boolean isSet(quickfix.field.NoSideCollateralReinvestments field) {
    return isSetField(field);
  }

  public boolean isSetNoSideCollateralReinvestments() {
    return isSetField(2864);
  }

public static class NoSideCollateralReinvestments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2867, 2865, 2866, 0};

  public NoSideCollateralReinvestments() {
    super(2864, 2867, ORDER);
  }

  public void set(quickfix.field.SideCollateralReinvestmentType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentType get(quickfix.field.SideCollateralReinvestmentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentType getSideCollateralReinvestmentType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentType());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentType() {
    return isSetField(2867);
  }

  public void set(quickfix.field.SideCollateralReinvestmentAmount value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentAmount get(quickfix.field.SideCollateralReinvestmentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentAmount getSideCollateralReinvestmentAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentAmount());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentAmount() {
    return isSetField(2865);
  }

  public void set(quickfix.field.SideCollateralReinvestmentCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentCurrency get(quickfix.field.SideCollateralReinvestmentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentCurrency getSideCollateralReinvestmentCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentCurrency() {
    return isSetField(2866);
  }
}

  public void set(quickfix.field.SideUnderlyingRefID value) {
    setField(value);
  }

  public quickfix.field.SideUnderlyingRefID get(quickfix.field.SideUnderlyingRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideUnderlyingRefID getSideUnderlyingRefID() throws FieldNotFound {
    return get(new quickfix.field.SideUnderlyingRefID());
  }

  public boolean isSet(quickfix.field.SideUnderlyingRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideUnderlyingRefID() {
    return isSetField(2863);
  }
}

  public void set(quickfix.field.SideCurrentCollateralAmount value) {
    setField(value);
  }

  public quickfix.field.SideCurrentCollateralAmount get(quickfix.field.SideCurrentCollateralAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCurrentCollateralAmount getSideCurrentCollateralAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCurrentCollateralAmount());
  }

  public boolean isSet(quickfix.field.SideCurrentCollateralAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCurrentCollateralAmount() {
    return isSetField(2702);
  }

  public void set(quickfix.field.SideCollateralCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralCurrency get(quickfix.field.SideCollateralCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralCurrency getSideCollateralCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralCurrency() {
    return isSetField(2695);
  }

  public void set(quickfix.field.SideCollateralAmountType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountType get(quickfix.field.SideCollateralAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountType getSideCollateralAmountType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountType());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountType() {
    return isSetField(2694);
  }

  public void set(quickfix.field.SideCollateralFXRate value) {
    setField(value);
  }

  public quickfix.field.SideCollateralFXRate get(quickfix.field.SideCollateralFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralFXRate getSideCollateralFXRate() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralFXRate());
  }

  public boolean isSet(quickfix.field.SideCollateralFXRate field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralFXRate() {
    return isSetField(2696);
  }

  public void set(quickfix.field.SideCollateralFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.SideCollateralFXRateCalc get(quickfix.field.SideCollateralFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralFXRateCalc getSideCollateralFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralFXRateCalc());
  }

  public boolean isSet(quickfix.field.SideCollateralFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralFXRateCalc() {
    return isSetField(2697);
  }

  public void set(quickfix.field.SideCollateralType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralType get(quickfix.field.SideCollateralType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralType getSideCollateralType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralType());
  }

  public boolean isSet(quickfix.field.SideCollateralType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralType() {
    return isSetField(2701);
  }

  public void set(quickfix.field.SideCollateralAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountMarketSegmentID get(quickfix.field.SideCollateralAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountMarketSegmentID getSideCollateralAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountMarketSegmentID() {
    return isSetField(2693);
  }

  public void set(quickfix.field.SideCollateralAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralAmountMarketID get(quickfix.field.SideCollateralAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralAmountMarketID getSideCollateralAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralAmountMarketID());
  }

  public boolean isSet(quickfix.field.SideCollateralAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralAmountMarketID() {
    return isSetField(2692);
  }

  public void set(quickfix.field.SideHaircutIndicator value) {
    setField(value);
  }

  public quickfix.field.SideHaircutIndicator get(quickfix.field.SideHaircutIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideHaircutIndicator getSideHaircutIndicator() throws FieldNotFound {
    return get(new quickfix.field.SideHaircutIndicator());
  }

  public boolean isSet(quickfix.field.SideHaircutIndicator field) {
    return isSetField(field);
  }

  public boolean isSetSideHaircutIndicator() {
    return isSetField(2703);
  }

  public void set(quickfix.field.SideCollateralPortfolioID value) {
    setField(value);
  }

  public quickfix.field.SideCollateralPortfolioID get(quickfix.field.SideCollateralPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralPortfolioID getSideCollateralPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralPortfolioID());
  }

  public boolean isSet(quickfix.field.SideCollateralPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralPortfolioID() {
    return isSetField(2700);
  }

  public void set(quickfix.field.SideCollateralPercentOverage value) {
    setField(value);
  }

  public quickfix.field.SideCollateralPercentOverage get(quickfix.field.SideCollateralPercentOverage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralPercentOverage getSideCollateralPercentOverage() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralPercentOverage());
  }

  public boolean isSet(quickfix.field.SideCollateralPercentOverage field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralPercentOverage() {
    return isSetField(2699);
  }

  public void set(quickfix.field.SideCollateralMarketPrice value) {
    setField(value);
  }

  public quickfix.field.SideCollateralMarketPrice get(quickfix.field.SideCollateralMarketPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralMarketPrice getSideCollateralMarketPrice() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralMarketPrice());
  }

  public boolean isSet(quickfix.field.SideCollateralMarketPrice field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralMarketPrice() {
    return isSetField(2698);
  }

  public void set(quickfix.field.SideCollateralReinvestmentRate value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentRate get(quickfix.field.SideCollateralReinvestmentRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentRate getSideCollateralReinvestmentRate() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentRate());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentRate field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentRate() {
    return isSetField(2862);
  }

  public void set(quickfix.fixlatest.component.SideCollateralReinvestmentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCollateralReinvestmentGrp get(quickfix.fixlatest.component.SideCollateralReinvestmentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCollateralReinvestmentGrp getSideCollateralReinvestmentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCollateralReinvestmentGrp());
  }

  public void set(quickfix.field.NoSideCollateralReinvestments value) {
    setField(value);
  }

  public quickfix.field.NoSideCollateralReinvestments get(quickfix.field.NoSideCollateralReinvestments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideCollateralReinvestments getNoSideCollateralReinvestments() throws FieldNotFound {
    return get(new quickfix.field.NoSideCollateralReinvestments());
  }

  public boolean isSet(quickfix.field.NoSideCollateralReinvestments field) {
    return isSetField(field);
  }

  public boolean isSetNoSideCollateralReinvestments() {
    return isSetField(2864);
  }

public static class NoSideCollateralReinvestments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2867, 2865, 2866, 0};

  public NoSideCollateralReinvestments() {
    super(2864, 2867, ORDER);
  }

  public void set(quickfix.field.SideCollateralReinvestmentType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentType get(quickfix.field.SideCollateralReinvestmentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentType getSideCollateralReinvestmentType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentType());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentType() {
    return isSetField(2867);
  }

  public void set(quickfix.field.SideCollateralReinvestmentAmount value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentAmount get(quickfix.field.SideCollateralReinvestmentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentAmount getSideCollateralReinvestmentAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentAmount());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentAmount() {
    return isSetField(2865);
  }

  public void set(quickfix.field.SideCollateralReinvestmentCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentCurrency get(quickfix.field.SideCollateralReinvestmentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentCurrency getSideCollateralReinvestmentCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentCurrency() {
    return isSetField(2866);
  }
}

  public void set(quickfix.field.SideUnderlyingRefID value) {
    setField(value);
  }

  public quickfix.field.SideUnderlyingRefID get(quickfix.field.SideUnderlyingRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideUnderlyingRefID getSideUnderlyingRefID() throws FieldNotFound {
    return get(new quickfix.field.SideUnderlyingRefID());
  }

  public boolean isSet(quickfix.field.SideUnderlyingRefID field) {
    return isSetField(field);
  }

  public boolean isSetSideUnderlyingRefID() {
    return isSetField(2863);
  }
}
