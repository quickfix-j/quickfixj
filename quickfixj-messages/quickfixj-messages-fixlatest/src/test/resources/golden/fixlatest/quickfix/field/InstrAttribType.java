/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class InstrAttribType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 871;

  public static final int FLAT = 1;

  public static final int ZERO_COUPON = 2;

  public static final int INTEREST_BEARING = 3;

  public static final int NO_PERIODIC_PAYMENTS = 4;

  public static final int VARIABLE_RATE = 5;

  public static final int LESS_FEE_FOR_PUT = 6;

  public static final int STEPPED_COUPON = 7;

  public static final int COUPON_PERIOD = 8;

  public static final int WHEN = 9;

  public static final int ORIGINAL_ISSUE_DISCOUNT = 10;

  public static final int CALLABLE = 11;

  public static final int ESCROWED_TO_MATURITY = 12;

  public static final int ESCROWED_TO_REDEMPTION_DATE = 13;

  public static final int PRE_REFUNDED = 14;

  public static final int IN_DEFAULT = 15;

  public static final int UNRATED = 16;

  public static final int TAXABLE = 17;

  public static final int INDEXED = 18;

  public static final int SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX = 19;

  public static final int ORIGINAL_ISSUE_DISCOUNT_PRICE = 20;

  public static final int CALLABLE_BELOW_MATURITY_VALUE = 21;

  public static final int CALLABLE_WITHOUT_NOTICE = 22;

  public static final int PRICE_TICK_RULES_FOR_SECURITY = 23;

  public static final int TRADE_TYPE_ELIGIBILITY_DETAILS_FOR_SECURITY = 24;

  public static final int INSTRUMENT_DENOMINATOR = 25;

  public static final int INSTRUMENT_NUMERATOR = 26;

  public static final int INSTRUMENT_PRICE_PRECISION = 27;

  public static final int INSTRUMENT_STRIKE_PRICE = 28;

  public static final int TRADEABLE_INDICATOR = 29;

  public static final int INSTRUMENT_ELIGIBLE_ANON_ORDERS = 30;

  public static final int MIN_GUARANTEED_FILL_VOLUME = 31;

  public static final int MIN_GUARANTEED_FILL_STATUS = 32;

  public static final int TRADE_AT_SETTLEMENT_ELIGIBILITY = 33;

  public static final int TEST_INSTRUMENT = 34;

  public static final int DUMMY_INSTRUMENT = 35;

  public static final int NEGATIVE_SETTLEMENT_PRICE_ELIGIBILITY = 36;

  public static final int NEGATIVE_STRIKE_PRICE_ELIGIBILITY = 37;

  public static final int USSTD_CONTRACT_IND = 38;

  public static final int ADMITTED_TO_TRADING_ON_TRADING_VENUE = 39;

  public static final int AVERAGE_DAILY_NOTIONAL_AMOUNT = 40;

  public static final int AVERAGE_DAILY_NUMBER_TRADES = 41;

  public static final int TEXT = 99;

  public InstrAttribType() {
    super(871);
  }

  public InstrAttribType(Integer data) {
    super(871, data);
  }

  public InstrAttribType(int data) {
    super(871, data);
  }
}
