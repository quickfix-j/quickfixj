/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class TradingSessionID extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 336;

  public static final String DAY = "1";

  public static final String HALF_DAY = "2";

  public static final String MORNING = "3";

  public static final String AFTERNOON = "4";

  public static final String EVENING = "5";

  public static final String AFTER_HOURS = "6";

  public static final String HOLIDAY = "7";

  public TradingSessionID() {
    super(336);
  }

  public TradingSessionID(String data) {
    super(336, data);
  }
}
