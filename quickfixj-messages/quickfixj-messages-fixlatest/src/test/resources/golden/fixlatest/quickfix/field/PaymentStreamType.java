/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40738;

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

  public PaymentStreamType() {
    super(40738);
  }

  public PaymentStreamType(Integer data) {
    super(40738, data);
  }

  public PaymentStreamType(int data) {
    super(40738, data);
  }
}
