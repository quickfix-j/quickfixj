/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class PaymentStreamFinalRateRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40804;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public PaymentStreamFinalRateRoundingDirection() {
    super(40804);
  }

  public PaymentStreamFinalRateRoundingDirection(Character data) {
    super(40804, data);
  }

  public PaymentStreamFinalRateRoundingDirection(char data) {
    super(40804, data);
  }
}
