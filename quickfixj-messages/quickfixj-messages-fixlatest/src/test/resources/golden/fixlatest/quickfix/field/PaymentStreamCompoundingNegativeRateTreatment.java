/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamCompoundingNegativeRateTreatment extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42645;

  public static final int ZERO_INTEREST_RATE_METHOD = 0;

  public static final int NEGATIVE_INTEREST_RATE_METHOD = 1;

  public PaymentStreamCompoundingNegativeRateTreatment() {
    super(42645);
  }

  public PaymentStreamCompoundingNegativeRateTreatment(Integer data) {
    super(42645, data);
  }

  public PaymentStreamCompoundingNegativeRateTreatment(int data) {
    super(42645, data);
  }
}
