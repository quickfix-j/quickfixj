/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class DividendFinalRateRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42232;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public DividendFinalRateRoundingDirection() {
    super(42232);
  }

  public DividendFinalRateRoundingDirection(Character data) {
    super(42232, data);
  }

  public DividendFinalRateRoundingDirection(char data) {
    super(42232, data);
  }
}
