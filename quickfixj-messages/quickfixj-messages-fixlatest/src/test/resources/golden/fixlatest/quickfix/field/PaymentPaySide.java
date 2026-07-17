/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentPaySide extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40214;

  public static final int BUY = 1;

  public static final int SELL = 2;

  public PaymentPaySide() {
    super(40214);
  }

  public PaymentPaySide(Integer data) {
    super(40214, data);
  }

  public PaymentPaySide(int data) {
    super(40214, data);
  }
}
