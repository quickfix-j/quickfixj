/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamPaymentDateType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41222;

  public static final int UNADJUSTED = 0;

  public static final int ADJUSTED = 1;

  public PaymentStreamPaymentDateType() {
    super(41222);
  }

  public PaymentStreamPaymentDateType(Integer data) {
    super(41222, data);
  }

  public PaymentStreamPaymentDateType(int data) {
    super(41222, data);
  }
}
