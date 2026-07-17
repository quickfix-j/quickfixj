/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LegPaymentStreamFinalRateRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40346;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public LegPaymentStreamFinalRateRoundingDirection() {
    super(40346);
  }

  public LegPaymentStreamFinalRateRoundingDirection(Character data) {
    super(40346, data);
  }

  public LegPaymentStreamFinalRateRoundingDirection(char data) {
    super(40346, data);
  }
}
