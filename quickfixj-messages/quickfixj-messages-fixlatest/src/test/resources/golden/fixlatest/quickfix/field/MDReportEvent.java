/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDReportEvent extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2535;

  public static final int START_INSTRUMENT_REF_DATA = 1;

  public static final int END_INSTRUMENT_REF_DATA = 2;

  public static final int START_OFF_MARKET_TRADES = 3;

  public static final int END_OFF_MARKET_TRADES = 4;

  public static final int START_ORDER_BOOK_TRADES = 5;

  public static final int END_ORDER_BOOK_TRADES = 6;

  public static final int START_OPEN_INTEREST = 7;

  public static final int END_OPEN_INTEREST = 8;

  public static final int START_SETTLEMENT_PRICES = 9;

  public static final int END_SETTLEMENT_PRICES = 10;

  public static final int START_STATS_REF_DATA = 11;

  public static final int END_STATS_REF_DATA = 12;

  public static final int START_STATISTICS = 13;

  public static final int END_STATISTICS = 14;

  public MDReportEvent() {
    super(2535);
  }

  public MDReportEvent(Integer data) {
    super(2535, data);
  }

  public MDReportEvent(int data) {
    super(2535, data);
  }
}
