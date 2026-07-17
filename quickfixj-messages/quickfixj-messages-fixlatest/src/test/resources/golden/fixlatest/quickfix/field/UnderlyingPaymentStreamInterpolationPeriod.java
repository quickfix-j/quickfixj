/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingPaymentStreamInterpolationPeriod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42899;

  public static final int INITIAL = 0;

  public static final int INITIAL_AND_FINAL = 1;

  public static final int FINAL = 2;

  public static final int ANY_PERIOD = 3;

  public UnderlyingPaymentStreamInterpolationPeriod() {
    super(42899);
  }

  public UnderlyingPaymentStreamInterpolationPeriod(Integer data) {
    super(42899, data);
  }

  public UnderlyingPaymentStreamInterpolationPeriod(int data) {
    super(42899, data);
  }
}
