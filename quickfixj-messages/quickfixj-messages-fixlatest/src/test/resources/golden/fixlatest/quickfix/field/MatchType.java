/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class MatchType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 574;

  public static final String ONE_PARTY_TRADE_REPORT = "1";

  public static final String TWO_PARTY_TRADE_REPORT = "2";

  public static final String CONFIRMED_TRADE_REPORT = "3";

  public static final String AUTO_MATCH = "4";

  public static final String CROSS_AUCTION = "5";

  public static final String COUNTER_ORDER_SELECTION = "6";

  public static final String CALL_AUCTION = "7";

  public static final String ISSUING = "8";

  public static final String SYSTEMATIC_INTERNALISER = "9";

  public static final String AUTO_MATCH_LAST_LOOK = "10";

  public static final String CROSS_AUCTION_LAST_LOOK = "11";

  public static final String ACTACCEPTED_TRADE = "M3";

  public static final String ACTDEFAULT_TRADE = "M4";

  public static final String ACTDEFAULT_AFTER_M2 = "M5";

  public static final String ACTM6MATCH = "M6";

  public static final String EXACT_MATCH_PLUS4BADGES_EXEC_TIME = "A1";

  public static final String EXACT_MATCH_PLUS4BADGES = "A2";

  public static final String EXACT_MATCH_PLUS2BADGES_EXEC_TIME = "A3";

  public static final String EXACT_MATCH_PLUS2BADGES = "A4";

  public static final String EXACT_MATCH_PLUS_EXEC_TIME = "A5";

  public static final String STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS = "AQ";

  public static final String A1EXACT_MATCH_SUMMARIZED_QUANTITY = "S1";

  public static final String A2EXACT_MATCH_SUMMARIZED_QUANTITY = "S2";

  public static final String A3EXACT_MATCH_SUMMARIZED_QUANTITY = "S3";

  public static final String A4EXACT_MATCH_SUMMARIZED_QUANTITY = "S4";

  public static final String A5EXACT_MATCH_SUMMARIZED_QUANTITY = "S5";

  public static final String EXACT_MATCH_MINUS_BADGES_TIMES = "M1";

  public static final String SUMMARIZED_MATCH_MINUS_BADGES_TIMES = "M2";

  public static final String OCSLOCKED_IN = "MT";

  public MatchType() {
    super(574);
  }

  public MatchType(String data) {
    super(574, data);
  }
}
