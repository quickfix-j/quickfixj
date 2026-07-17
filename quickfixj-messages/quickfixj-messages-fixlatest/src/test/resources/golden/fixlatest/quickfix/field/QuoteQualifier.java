/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class QuoteQualifier extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 695;

  public static final char ALL_OR_NONE = 'A';

  public static final char MARKET_ON_CLOSE = 'B';

  public static final char AT_THE_CLOSE = 'C';

  public static final char VWAP = 'D';

  public static final char AXE = 'E';

  public static final char AXE_ON_BID = 'F';

  public static final char AXE_ON_OFFER = 'G';

  public static final char CLIENT_NATURAL_WORKING = 'H';

  public static final char IN_TOUCH_WITH = 'I';

  public static final char POSITION_WANTED = 'J';

  public static final char MARKET_MAKING = 'K';

  public static final char LIMIT = 'L';

  public static final char MORE_BEHIND = 'M';

  public static final char CLIENT_NATURAL_BLOCK = 'N';

  public static final char AT_THE_OPEN = 'O';

  public static final char TAKING_APOSITION = 'P';

  public static final char AT_THE_MARKET = 'Q';

  public static final char READY_TO_TRADE = 'R';

  public static final char PORTFOLIO_SHOWN = 'S';

  public static final char THROUGH_THE_DAY = 'T';

  public static final char UNWIND = 'U';

  public static final char VERSUS = 'V';

  public static final char INDICATION = 'W';

  public static final char CROSSING_OPPORTUNITY = 'X';

  public static final char AT_THE_MIDPOINT = 'Y';

  public static final char PRE_OPEN = 'Z';

  public static final char QUANTITY_NEGOTIABLE = '1';

  public static final char ALLOW_LATE_BIDS = '2';

  public static final char IMMEDIATE_OR_COUNTER = '3';

  public static final char AUTO_TRADE = '4';

  public static final char AUTOMATIC_SPOT = 'a';

  public static final char PLATFORM_CALCULATED_SPOT = 'b';

  public static final char OUTSIDE_SPREAD = 'c';

  public static final char DEFERRED_SPOT = 'd';

  public static final char NEGOTIATED_SPOT = 'n';

  public QuoteQualifier() {
    super(695);
  }

  public QuoteQualifier(Character data) {
    super(695, data);
  }

  public QuoteQualifier(char data) {
    super(695, data);
  }
}
