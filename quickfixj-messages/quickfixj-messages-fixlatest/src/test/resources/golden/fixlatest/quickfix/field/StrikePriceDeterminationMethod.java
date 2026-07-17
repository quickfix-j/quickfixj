/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StrikePriceDeterminationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1478;

  public static final int FIXED_STRIKE = 1;

  public static final int STRIKE_SET_AT_EXPIRATION = 2;

  public static final int STRIKE_SET_TO_AVERAGE_ACROSS_LIFE = 3;

  public static final int STRIKE_SET_TO_OPTIMAL_VALUE = 4;

  public StrikePriceDeterminationMethod() {
    super(1478);
  }

  public StrikePriceDeterminationMethod(Integer data) {
    super(1478, data);
  }

  public StrikePriceDeterminationMethod(int data) {
    super(1478, data);
  }
}
