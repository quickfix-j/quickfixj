/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStreamNegativeRateTreatment extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40349;

  public static final int ZERO_INTEREST_RATE_METHOD = 0;

  public static final int NEGATIVE_INTEREST_RATE_METHOD = 1;

  public LegPaymentStreamNegativeRateTreatment() {
    super(40349);
  }

  public LegPaymentStreamNegativeRateTreatment(Integer data) {
    super(40349, data);
  }

  public LegPaymentStreamNegativeRateTreatment(int data) {
    super(40349, data);
  }
}
