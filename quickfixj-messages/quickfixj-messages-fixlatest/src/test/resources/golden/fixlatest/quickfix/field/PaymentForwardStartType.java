/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentForwardStartType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41160;

  public static final int PREPAID = 0;

  public static final int POSTPAID = 1;

  public static final int VARIABLE = 2;

  public static final int FIXED = 3;

  public PaymentForwardStartType() {
    super(41160);
  }

  public PaymentForwardStartType(Integer data) {
    super(41160, data);
  }

  public PaymentForwardStartType(int data) {
    super(41160, data);
  }
}
