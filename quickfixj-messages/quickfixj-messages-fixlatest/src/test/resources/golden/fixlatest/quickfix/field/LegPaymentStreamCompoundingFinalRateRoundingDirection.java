/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LegPaymentStreamCompoundingFinalRateRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42441;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public LegPaymentStreamCompoundingFinalRateRoundingDirection() {
    super(42441);
  }

  public LegPaymentStreamCompoundingFinalRateRoundingDirection(Character data) {
    super(42441, data);
  }

  public LegPaymentStreamCompoundingFinalRateRoundingDirection(char data) {
    super(42441, data);
  }
}
