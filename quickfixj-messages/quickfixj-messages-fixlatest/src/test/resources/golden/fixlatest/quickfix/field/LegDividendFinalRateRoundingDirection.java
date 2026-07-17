/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LegDividendFinalRateRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42326;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public LegDividendFinalRateRoundingDirection() {
    super(42326);
  }

  public LegDividendFinalRateRoundingDirection(Character data) {
    super(42326, data);
  }

  public LegDividendFinalRateRoundingDirection(char data) {
    super(42326, data);
  }
}
