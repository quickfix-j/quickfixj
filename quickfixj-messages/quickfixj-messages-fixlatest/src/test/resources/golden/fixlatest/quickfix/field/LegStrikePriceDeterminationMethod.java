/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegStrikePriceDeterminationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2186;

  public static final int FIXED_STRIKE = 1;

  public static final int STRIKE_SET_AT_EXPIRATION = 2;

  public static final int STRIKE_SET_TO_AVERAGE_ACROSS_LIFE = 3;

  public static final int STRIKE_SET_TO_OPTIMAL_VALUE = 4;

  public LegStrikePriceDeterminationMethod() {
    super(2186);
  }

  public LegStrikePriceDeterminationMethod(Integer data) {
    super(2186, data);
  }

  public LegStrikePriceDeterminationMethod(int data) {
    super(2186, data);
  }
}
