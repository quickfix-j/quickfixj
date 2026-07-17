/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class OpenCloseSettlFlag extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 286;

  public static final String DAILY_OPEN = "0";

  public static final String SESSION_OPEN = "1";

  public static final String DELIVERY_SETTLEMENT_ENTRY = "2";

  public static final String EXPECTED_ENTRY = "3";

  public static final String ENTRY_FROM_PREVIOUS_BUSINESS_DAY = "4";

  public static final String THEORETICAL_PRICE_VALUE = "5";

  public OpenCloseSettlFlag() {
    super(286);
  }

  public OpenCloseSettlFlag(String data) {
    super(286, data);
  }
}
