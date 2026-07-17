/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteAckStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1865;

  public static final int RECEIVED_NOT_YET_PROCESSED = 0;

  public static final int ACCEPTED = 1;

  public static final int REJECTED = 2;

  public QuoteAckStatus() {
    super(1865);
  }

  public QuoteAckStatus(Integer data) {
    super(1865, data);
  }

  public QuoteAckStatus(int data) {
    super(1865, data);
  }
}
