/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentReceiveSide extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40215;

  public static final int BUY = 1;

  public static final int SELL = 2;

  public PaymentReceiveSide() {
    super(40215);
  }

  public PaymentReceiveSide(Integer data) {
    super(40215, data);
  }

  public PaymentReceiveSide(int data) {
    super(40215, data);
  }
}
