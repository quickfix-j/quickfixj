/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class PaymentStreamCompoundingFinalRateRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42642;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public PaymentStreamCompoundingFinalRateRoundingDirection() {
    super(42642);
  }

  public PaymentStreamCompoundingFinalRateRoundingDirection(Character data) {
    super(42642, data);
  }

  public PaymentStreamCompoundingFinalRateRoundingDirection(char data) {
    super(42642, data);
  }
}
