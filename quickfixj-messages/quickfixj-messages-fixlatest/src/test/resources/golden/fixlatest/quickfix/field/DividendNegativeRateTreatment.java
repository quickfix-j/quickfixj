/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DividendNegativeRateTreatment extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42235;

  public static final int ZERO_INTEREST_RATE_METHOD = 0;

  public static final int NEGATIVE_INTEREST_RATE_METHOD = 1;

  public DividendNegativeRateTreatment() {
    super(42235);
  }

  public DividendNegativeRateTreatment(Integer data) {
    super(42235, data);
  }

  public DividendNegativeRateTreatment(int data) {
    super(42235, data);
  }
}
