/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamDiscountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40744;

  public static final int STANDARD = 0;

  public static final int FRA = 1;

  public PaymentStreamDiscountType() {
    super(40744);
  }

  public PaymentStreamDiscountType(Integer data) {
    super(40744, data);
  }

  public PaymentStreamDiscountType(int data) {
    super(40744, data);
  }
}
