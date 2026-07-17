/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PayRequestStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2813;

  public static final int RECEIVED = 0;

  public static final int ACCEPTED = 1;

  public static final int REJECTED = 2;

  public static final int DISPUTED = 3;

  public PayRequestStatus() {
    super(2813);
  }

  public PayRequestStatus(Integer data) {
    super(2813, data);
  }

  public PayRequestStatus(int data) {
    super(2813, data);
  }
}
