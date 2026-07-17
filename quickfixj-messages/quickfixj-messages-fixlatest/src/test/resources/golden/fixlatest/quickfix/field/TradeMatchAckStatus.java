/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeMatchAckStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1896;

  public static final int RECEIVED_NOT_PROCESSED = 0;

  public static final int ACCEPTED = 1;

  public static final int REJECTED = 2;

  public TradeMatchAckStatus() {
    super(1896);
  }

  public TradeMatchAckStatus(Integer data) {
    super(1896, data);
  }

  public TradeMatchAckStatus(int data) {
    super(1896, data);
  }
}
