/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class MDReqRejReason extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 281;

  public static final char UNKNOWN_SYMBOL = '0';

  public static final char DUPLICATE_MDREQ_ID = '1';

  public static final char INSUFFICIENT_BANDWIDTH = '2';

  public static final char INSUFFICIENT_PERMISSIONS = '3';

  public static final char UNSUPPORTED_SUBSCRIPTION_REQUEST_TYPE = '4';

  public static final char UNSUPPORTED_MARKET_DEPTH = '5';

  public static final char UNSUPPORTED_MDUPDATE_TYPE = '6';

  public static final char UNSUPPORTED_AGGREGATED_BOOK = '7';

  public static final char UNSUPPORTED_MDENTRY_TYPE = '8';

  public static final char UNSUPPORTED_TRADING_SESSION_ID = '9';

  public static final char UNSUPPORTED_SCOPE = 'A';

  public static final char UNSUPPORTED_OPEN_CLOSE_SETTLE_FLAG = 'B';

  public static final char UNSUPPORTED_MDIMPLICIT_DELETE = 'C';

  public static final char INSUFFICIENT_CREDIT = 'D';

  public MDReqRejReason() {
    super(281);
  }

  public MDReqRejReason(Character data) {
    super(281, data);
  }

  public MDReqRejReason(char data) {
    super(281, data);
  }
}
