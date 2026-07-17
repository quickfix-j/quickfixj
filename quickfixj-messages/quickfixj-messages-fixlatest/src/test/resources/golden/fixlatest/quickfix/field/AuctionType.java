/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AuctionType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1803;

  public static final int NONE = 0;

  public static final int BLOCK_ORDER_AUCTION = 1;

  public static final int DIRECTED_ORDER_AUCTION = 2;

  public static final int EXPOSURE_ORDER_AUCTION = 3;

  public static final int FLASH_ORDER_AUCTION = 4;

  public static final int FACILITATION_ORDER_AUCTION = 5;

  public static final int SOLICITATION_ORDER_AUCTION = 6;

  public static final int PRICE_IMPROVEMENT_MECHANISM = 7;

  public static final int DIRECTED_ORDER_PRICE_IMPROVEMENT_MECHANISM = 8;

  public AuctionType() {
    super(1803);
  }

  public AuctionType(Integer data) {
    super(1803, data);
  }

  public AuctionType(int data) {
    super(1803, data);
  }
}
