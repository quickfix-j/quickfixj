/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeAllocStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1840;

  public static final int PENDING_CLEAR = 0;

  public static final int CLAIMED = 1;

  public static final int CLEARED = 2;

  public static final int REJECTED = 3;

  public TradeAllocStatus() {
    super(1840);
  }

  public TradeAllocStatus(Integer data) {
    super(1840, data);
  }

  public TradeAllocStatus(int data) {
    super(1840, data);
  }
}
