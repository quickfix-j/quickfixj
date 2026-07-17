/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideRegulatoryTradeIDType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1975;

  public static final int CURRENT = 0;

  public static final int PREVIOUS = 1;

  public static final int BLOCK = 2;

  public static final int RELATED = 3;

  public static final int CLEARED_BLOCK_TRADE = 4;

  public static final int TRADING_VENUE_TRANSACTION_IDENTIFIER = 5;

  public SideRegulatoryTradeIDType() {
    super(1975);
  }

  public SideRegulatoryTradeIDType(Integer data) {
    super(1975, data);
  }

  public SideRegulatoryTradeIDType(int data) {
    super(1975, data);
  }
}
