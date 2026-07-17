/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingPriceDeterminationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1481;

  public static final int REGULAR = 1;

  public static final int SPECIAL_REFERENCE = 2;

  public static final int OPTIMAL_VALUE = 3;

  public static final int AVERAGE_VALUE = 4;

  public UnderlyingPriceDeterminationMethod() {
    super(1481);
  }

  public UnderlyingPriceDeterminationMethod(Integer data) {
    super(1481, data);
  }

  public UnderlyingPriceDeterminationMethod(int data) {
    super(1481, data);
  }
}
