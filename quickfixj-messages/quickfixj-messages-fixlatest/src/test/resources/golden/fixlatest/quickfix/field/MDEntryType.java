/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class MDEntryType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 269;

  public static final char BID = '0';

  public static final char OFFER = '1';

  public static final char TRADE = '2';

  public static final char INDEX_VALUE = '3';

  public static final char OPENING_PRICE = '4';

  public static final char CLOSING_PRICE = '5';

  public static final char SETTLEMENT_PRICE = '6';

  public static final char TRADING_SESSION_HIGH_PRICE = '7';

  public static final char TRADING_SESSION_LOW_PRICE = '8';

  public static final char VWAP = '9';

  public static final char IMBALANCE = 'A';

  public static final char TRADE_VOLUME = 'B';

  public static final char OPEN_INTEREST = 'C';

  public static final char COMPOSITE_UNDERLYING_PRICE = 'D';

  public static final char SIMULATED_SELL_PRICE = 'E';

  public static final char SIMULATED_BUY_PRICE = 'F';

  public static final char MARGIN_RATE = 'G';

  public static final char MID_PRICE = 'H';

  public static final char EMPTY_BOOK = 'J';

  public static final char SETTLE_HIGH_PRICE = 'K';

  public static final char SETTLE_LOW_PRICE = 'L';

  public static final char PRIOR_SETTLE_PRICE = 'M';

  public static final char SESSION_HIGH_BID = 'N';

  public static final char SESSION_LOW_OFFER = 'O';

  public static final char EARLY_PRICES = 'P';

  public static final char AUCTION_CLEARING_PRICE = 'Q';

  public static final char SWAP_VALUE_FACTOR = 'S';

  public static final char DAILY_VALUE_ADJUSTMENT_FOR_LONG_POSITIONS = 'R';

  public static final char CUMULATIVE_VALUE_ADJUSTMENT_FOR_LONG_POSITIONS = 'T';

  public static final char DAILY_VALUE_ADJUSTMENT_FOR_SHORT_POSITIONS = 'U';

  public static final char CUMULATIVE_VALUE_ADJUSTMENT_FOR_SHORT_POSITIONS = 'V';

  public static final char FIXING_PRICE = 'W';

  public static final char CASH_RATE = 'X';

  public static final char RECOVERY_RATE = 'Y';

  public static final char RECOVERY_RATE_FOR_LONG = 'Z';

  public static final char RECOVERY_RATE_FOR_SHORT = 'a';

  public static final char MARKET_BID = 'b';

  public static final char MARKET_OFFER = 'c';

  public static final char SHORT_SALE_MIN_PRICE = 'd';

  public static final char PREVIOUS_CLOSING_PRICE = 'e';

  public static final char THRESHOLD_LIMIT_PRICE_BANDING = 'g';

  public static final char DAILY_FINANCING_VALUE = 'h';

  public static final char ACCRUED_FINANCING_VALUE = 'i';

  public static final char TWAP = 't';

  public MDEntryType() {
    super(269);
  }

  public MDEntryType(Character data) {
    super(269, data);
  }

  public MDEntryType(char data) {
    super(269, data);
  }
}
