/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ReturnTrigger extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2753;

  public static final int DIVIDEND = 1;

  public static final int VARIANCE = 2;

  public static final int VOLATILITY = 3;

  public static final int TOTAL_RETURN = 4;

  public static final int CONTRACT_FOR_DIFFERENCE = 5;

  public static final int CREDIT_DEFAULT = 6;

  public static final int SPREAD_BET = 7;

  public static final int PRICE = 8;

  public static final int FORWARD_PRICE_UNDERLYING_INSTRUMENT = 9;

  public static final int OTHER = 99;

  public ReturnTrigger() {
    super(2753);
  }

  public ReturnTrigger(Integer data) {
    super(2753, data);
  }

  public ReturnTrigger(int data) {
    super(2753, data);
  }
}
