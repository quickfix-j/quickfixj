/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStreamType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40279;

  public static final int PERIODIC = 0;

  public static final int INITIAL = 1;

  public static final int SINGLE = 2;

  public static final int DIVIDEND = 3;

  public static final int INTEREST = 4;

  public static final int DIVIDEND_RETURN = 5;

  public static final int PRICE_RETURN = 6;

  public static final int TOTAL_RETURN = 7;

  public static final int VARIANCE = 8;

  public static final int CORRELATION = 9;

  public LegPaymentStreamType() {
    super(40279);
  }

  public LegPaymentStreamType(Integer data) {
    super(40279, data);
  }

  public LegPaymentStreamType(int data) {
    super(40279, data);
  }
}
