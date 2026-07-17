/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class VenueType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1430;

  public static final char ELECTRONIC = 'E';

  public static final char PIT = 'P';

  public static final char EX_PIT = 'X';

  public static final char CLEARING_HOUSE = 'C';

  public static final char REGISTERED_MARKET = 'R';

  public static final char OFF_MARKET = 'O';

  public static final char CENTRAL_LIMIT_ORDER_BOOK = 'B';

  public static final char QUOTE_DRIVEN_MARKET = 'Q';

  public static final char DARK_ORDER_BOOK = 'D';

  public static final char AUCTION_DRIVEN_MARKET = 'A';

  public static final char QUOTE_NEGOTIATION = 'N';

  public static final char VOICE_NEGOTIATION = 'V';

  public static final char HYBRID_MARKET = 'H';

  public VenueType() {
    super(1430);
  }

  public VenueType(Character data) {
    super(1430, data);
  }

  public VenueType(char data) {
    super(1430, data);
  }
}
