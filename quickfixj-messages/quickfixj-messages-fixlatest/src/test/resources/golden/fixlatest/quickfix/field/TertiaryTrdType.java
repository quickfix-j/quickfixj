/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TertiaryTrdType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2896;

  public static final int REGULAR_TRADE = 0;

  public static final int BLOCK_TRADE = 1;

  public static final int EFP = 2;

  public static final int TRANSFER = 3;

  public static final int LATE_TRADE = 4;

  public static final int TTRADE = 5;

  public static final int WEIGHTED_AVERAGE_PRICE_TRADE = 6;

  public static final int BUNCHED_TRADE = 7;

  public static final int LATE_BUNCHED_TRADE = 8;

  public static final int PRIOR_REFERENCE_PRICE_TRADE = 9;

  public static final int AFTER_HOURS_TRADE = 10;

  public static final int EXCHANGE_FOR_RISK = 11;

  public static final int EXCHANGE_FOR_SWAP = 12;

  public static final int EXCHANGE_OF_FUTURES_FOR = 13;

  public static final int EXCHANGE_OF_OPTIONS_FOR_OPTIONS = 14;

  public static final int TRADING_AT_SETTLEMENT = 15;

  public static final int ALL_OR_NONE = 16;

  public static final int FUTURES_LARGE_ORDER_EXECUTION = 17;

  public static final int EXCHANGE_OF_FUTURES_FOR_FUTURES = 18;

  public static final int OPTION_INTERIM_TRADE = 19;

  public static final int OPTION_CABINET_TRADE = 20;

  public static final int PRIVATELY_NEGOTIATED_TRADES = 22;

  public static final int SUBSTITUTION_OF_FUTURES_FOR_FORWARDS = 23;

  public static final int NON_STANDARD_SETTLEMENT = 48;

  public static final int DERIVATIVE_RELATED_TRANSACTION = 49;

  public static final int PORTFOLIO_TRADE = 50;

  public static final int VOLUME_WEIGHTED_AVERAGE_TRADE = 51;

  public static final int EXCHANGE_GRANTED_TRADE = 52;

  public static final int REPURCHASE_AGREEMENT = 53;

  public static final int OTC = 54;

  public static final int EXCHANGE_BASIS_FACILITY = 55;

  public static final int OPENING_TRADE = 56;

  public static final int NETTED_TRADE = 57;

  public static final int BLOCK_SWAP_TRADE = 58;

  public static final int CREDIT_EVENT_TRADE = 59;

  public static final int SUCCESSION_EVENT_TRADE = 60;

  public static final int GIVE_UP_GIVE_IN_TRADE = 61;

  public static final int DARK_TRADE = 62;

  public static final int TECHNICAL_TRADE = 63;

  public static final int BENCHMARK = 64;

  public static final int PACKAGE_TRADE = 65;

  public static final int ROLL_TRADE = 66;

  public static final int ERROR_TRADE = 24;

  public static final int SPECIAL_CUM_DIVIDEND = 25;

  public static final int SPECIAL_EX_DIVIDEND = 26;

  public static final int SPECIAL_CUM_COUPON = 27;

  public static final int SPECIAL_EX_COUPON = 28;

  public static final int CASH_SETTLEMENT = 29;

  public static final int SPECIAL_PRICE = 30;

  public static final int GUARANTEED_DELIVERY = 31;

  public static final int SPECIAL_CUM_RIGHTS = 32;

  public static final int SPECIAL_EX_RIGHTS = 33;

  public static final int SPECIAL_CUM_CAPITAL_REPAYMENTS = 34;

  public static final int SPECIAL_EX_CAPITAL_REPAYMENTS = 35;

  public static final int SPECIAL_CUM_BONUS = 36;

  public static final int SPECIAL_EX_BONUS = 37;

  public static final int LARGE_TRADE = 38;

  public static final int WORKED_PRINCIPAL_TRADE = 39;

  public static final int BLOCK_TRADES = 40;

  public static final int NAME_CHANGE = 41;

  public static final int PORTFOLIO_TRANSFER = 42;

  public static final int PROROGATION_BUY = 43;

  public static final int PROROGATION_SELL = 44;

  public static final int OPTION_EXERCISE = 45;

  public static final int DELTA_NEUTRAL_TRANSACTION = 46;

  public static final int FINANCING_TRANSACTION = 47;

  public TertiaryTrdType() {
    super(2896);
  }

  public TertiaryTrdType(Integer data) {
    super(2896, data);
  }

  public TertiaryTrdType(int data) {
    super(2896, data);
  }
}
