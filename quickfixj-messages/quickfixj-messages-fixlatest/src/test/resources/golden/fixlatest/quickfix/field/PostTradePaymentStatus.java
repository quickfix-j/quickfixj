/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PostTradePaymentStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2823;

  public static final int NEW = 0;

  public static final int INITIATED = 1;

  public static final int PENDING = 2;

  public static final int CONFIRMED = 3;

  public static final int REJECTED = 4;

  public PostTradePaymentStatus() {
    super(2823);
  }

  public PostTradePaymentStatus(Integer data) {
    super(2823, data);
  }

  public PostTradePaymentStatus(int data) {
    super(2823, data);
  }
}
