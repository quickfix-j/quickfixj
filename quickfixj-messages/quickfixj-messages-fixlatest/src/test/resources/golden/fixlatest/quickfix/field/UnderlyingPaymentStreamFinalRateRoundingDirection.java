/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class UnderlyingPaymentStreamFinalRateRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40635;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public UnderlyingPaymentStreamFinalRateRoundingDirection() {
    super(40635);
  }

  public UnderlyingPaymentStreamFinalRateRoundingDirection(Character data) {
    super(40635, data);
  }

  public UnderlyingPaymentStreamFinalRateRoundingDirection(char data) {
    super(40635, data);
  }
}
