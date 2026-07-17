/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class OrderRestrictions extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 529;

  public static final String PROGRAM_TRADE = "1";

  public static final String INDEX_ARBITRAGE = "2";

  public static final String NON_INDEX_ARBITRAGE = "3";

  public static final String COMPETING_MARKET_MAKER = "4";

  public static final String ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_SECURITY = "5";

  public static final String ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_UNDERLYING = "6";

  public static final String FOREIGN_ENTITY = "7";

  public static final String EXTERNAL_MARKET_PARTICIPANT = "8";

  public static final String EXTERNAL_INTER_CONNECTED_MARKET_LINKAGE = "9";

  public static final String RISKLESS_ARBITRAGE = "A";

  public static final String ISSUER_HOLDING = "B";

  public static final String ISSUE_PRICE_STABILIZATION = "C";

  public static final String NON_ALGORITHMIC = "D";

  public static final String ALGORITHMIC = "E";

  public static final String CROSS = "F";

  public static final String INSIDER_ACCOUNT = "G";

  public static final String SIGNIFICANT_SHAREHOLDER = "H";

  public static final String NORMAL_COURSE_ISSUER_BID = "I";

  public OrderRestrictions() {
    super(529);
  }

  public OrderRestrictions(String data) {
    super(529, data);
  }
}
