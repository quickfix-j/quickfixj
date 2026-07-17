/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LiquidityIndType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 409;

  public static final int FIVE_DAY_MOVING_AVERAGE = 1;

  public static final int TWENTY_DAY_MOVING_AVERAGE = 2;

  public static final int NORMAL_MARKET_SIZE = 3;

  public static final int OTHER = 4;

  public LiquidityIndType() {
    super(409);
  }

  public LiquidityIndType(Integer data) {
    super(409, data);
  }

  public LiquidityIndType(int data) {
    super(409, data);
  }
}
