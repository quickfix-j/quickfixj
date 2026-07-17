/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamNegativeRateTreatment extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40807;

  public static final int ZERO_INTEREST_RATE_METHOD = 0;

  public static final int NEGATIVE_INTEREST_RATE_METHOD = 1;

  public PaymentStreamNegativeRateTreatment() {
    super(40807);
  }

  public PaymentStreamNegativeRateTreatment(Integer data) {
    super(40807, data);
  }

  public PaymentStreamNegativeRateTreatment(int data) {
    super(40807, data);
  }
}
