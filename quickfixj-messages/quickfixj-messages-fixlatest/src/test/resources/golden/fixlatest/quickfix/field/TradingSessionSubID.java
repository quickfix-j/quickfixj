/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class TradingSessionSubID extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 625;

  public static final String PRE_TRADING = "1";

  public static final String OPENING_OR_OPENING_AUCTION = "2";

  public static final String CONTINUOUS = "3";

  public static final String CLOSING_OR_CLOSING_AUCTION = "4";

  public static final String POST_TRADING = "5";

  public static final String SCHEDULED_INTRADAY_AUCTION = "6";

  public static final String QUIESCENT = "7";

  public static final String ANY_AUCTION = "8";

  public static final String UNSCHEDULED_INTRADAY_AUCTION = "9";

  public static final String OUT_OF_MAIN_SESSION_TRADING = "10";

  public static final String PRIVATE_AUCTION = "11";

  public static final String PUBLIC_AUCTION = "12";

  public static final String GROUP_AUCTION = "13";

  public TradingSessionSubID() {
    super(625);
  }

  public TradingSessionSubID(String data) {
    super(625, data);
  }
}
