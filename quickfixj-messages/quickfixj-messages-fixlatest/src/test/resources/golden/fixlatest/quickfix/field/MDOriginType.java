/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDOriginType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1024;

  public static final int BOOK = 0;

  public static final int OFF_BOOK = 1;

  public static final int CROSS = 2;

  public static final int QUOTE_DRIVEN_MARKET = 3;

  public static final int DARK_ORDER_BOOK = 4;

  public static final int AUCTION_DRIVEN_MARKET = 5;

  public static final int QUOTE_NEGOTIATION = 6;

  public static final int VOICE_NEGOTIATION = 7;

  public static final int HYBRID_MARKET = 8;

  public MDOriginType() {
    super(1024);
  }

  public MDOriginType(Integer data) {
    super(1024, data);
  }

  public MDOriginType(int data) {
    super(1024, data);
  }
}
