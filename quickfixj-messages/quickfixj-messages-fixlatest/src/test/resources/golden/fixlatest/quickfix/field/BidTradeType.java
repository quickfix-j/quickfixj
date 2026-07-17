/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class BidTradeType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 418;

  public static final char AGENCY = 'A';

  public static final char VWAPGUARANTEE = 'G';

  public static final char GUARANTEED_CLOSE = 'J';

  public static final char RISK_TRADE = 'R';

  public BidTradeType() {
    super(418);
  }

  public BidTradeType(Character data) {
    super(418, data);
  }

  public BidTradeType(char data) {
    super(418, data);
  }
}
