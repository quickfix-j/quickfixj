/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class UnderlyingDividendFinalRateRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42815;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public UnderlyingDividendFinalRateRoundingDirection() {
    super(42815);
  }

  public UnderlyingDividendFinalRateRoundingDirection(Character data) {
    super(42815, data);
  }

  public UnderlyingDividendFinalRateRoundingDirection(char data) {
    super(42815, data);
  }
}
