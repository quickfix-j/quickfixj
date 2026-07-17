/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamCompoundingMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40747;

  public static final int NONE = 0;

  public static final int FLAT = 1;

  public static final int STRAIGHT = 2;

  public static final int SPREAD_EXCLUSIVE = 3;

  public PaymentStreamCompoundingMethod() {
    super(40747);
  }

  public PaymentStreamCompoundingMethod(Integer data) {
    super(40747, data);
  }

  public PaymentStreamCompoundingMethod(int data) {
    super(40747, data);
  }
}
