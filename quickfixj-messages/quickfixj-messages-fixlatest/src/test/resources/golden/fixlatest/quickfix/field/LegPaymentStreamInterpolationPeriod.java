/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStreamInterpolationPeriod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42403;

  public static final int INITIAL = 0;

  public static final int INITIAL_AND_FINAL = 1;

  public static final int FINAL = 2;

  public static final int ANY_PERIOD = 3;

  public LegPaymentStreamInterpolationPeriod() {
    super(42403);
  }

  public LegPaymentStreamInterpolationPeriod(Integer data) {
    super(42403, data);
  }

  public LegPaymentStreamInterpolationPeriod(int data) {
    super(42403, data);
  }
}
