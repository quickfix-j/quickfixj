/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeRequestStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 750;

  public static final int ACCEPTED = 0;

  public static final int COMPLETED = 1;

  public static final int REJECTED = 2;

  public TradeRequestStatus() {
    super(750);
  }

  public TradeRequestStatus(Integer data) {
    super(750, data);
  }

  public TradeRequestStatus(int data) {
    super(750, data);
  }
}
