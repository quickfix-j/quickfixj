/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AuctionInstruction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1805;

  public static final int AUTOMATED_AUCTION_PERMITTED = 0;

  public static final int AUTOMATED_AUCTION_NOT_PERMITTED = 1;

  public AuctionInstruction() {
    super(1805);
  }

  public AuctionInstruction(Integer data) {
    super(1805, data);
  }

  public AuctionInstruction(int data) {
    super(1805, data);
  }
}
