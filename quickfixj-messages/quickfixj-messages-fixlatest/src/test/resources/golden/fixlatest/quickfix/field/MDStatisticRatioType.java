/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDStatisticRatioType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2472;

  public static final int BUYERS_TO_SELLERS = 1;

  public static final int UPTICKS_TO_DOWNTICKS = 2;

  public static final int MARKET_MAKER_TO_NON_MARKET_MAKER = 3;

  public static final int AUTOMATED_TO_NON_AUTOMATED = 4;

  public static final int ORDERS_TO_TRADES = 5;

  public static final int QUOTES_TO_TRADES = 6;

  public static final int ORDERS_AND_QUOTES_TO_TRADES = 7;

  public static final int FAILED_TO_TOTAL_TRADED_VALUE = 8;

  public static final int BENEFITS_TO_TOTAL_TRADED_VALUE = 9;

  public static final int FEES_TO_TOTAL_TRADED_VALUE = 10;

  public static final int TRADE_VOLUME_TO_TOTAL_TRADED_VOLUME = 11;

  public static final int ORDERS_TO_TOTAL_NUMBER_ORDERS = 12;

  public MDStatisticRatioType() {
    super(2472);
  }

  public MDStatisticRatioType(Integer data) {
    super(2472, data);
  }

  public MDStatisticRatioType(int data) {
    super(2472, data);
  }
}
