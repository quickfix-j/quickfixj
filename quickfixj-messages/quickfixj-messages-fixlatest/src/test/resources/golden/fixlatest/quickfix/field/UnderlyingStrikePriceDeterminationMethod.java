/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingStrikePriceDeterminationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2023;

  public static final int FIXED_STRIKE = 1;

  public static final int STRIKE_SET_AT_EXPIRATION = 2;

  public static final int STRIKE_SET_TO_AVERAGE_ACROSS_LIFE = 3;

  public static final int STRIKE_SET_TO_OPTIMAL_VALUE = 4;

  public UnderlyingStrikePriceDeterminationMethod() {
    super(2023);
  }

  public UnderlyingStrikePriceDeterminationMethod(Integer data) {
    super(2023, data);
  }

  public UnderlyingStrikePriceDeterminationMethod(int data) {
    super(2023, data);
  }
}
