/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class SettlSessID extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 716;

  public static final String INTRADAY = "ITD";

  public static final String REGULAR_TRADING_HOURS = "RTH";

  public static final String ELECTRONIC_TRADING_HOURS = "ETH";

  public static final String END_OF_DAY = "EOD";

  public SettlSessID() {
    super(716);
  }

  public SettlSessID(String data) {
    super(716, data);
  }
}
