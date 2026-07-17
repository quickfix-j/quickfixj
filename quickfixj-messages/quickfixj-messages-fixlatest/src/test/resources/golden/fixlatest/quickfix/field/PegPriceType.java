/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PegPriceType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1094;

  public static final int LAST_PEG = 1;

  public static final int MID_PRICE_PEG = 2;

  public static final int OPENING_PEG = 3;

  public static final int MARKET_PEG = 4;

  public static final int PRIMARY_PEG = 5;

  public static final int PEG_TO_VWAP = 7;

  public static final int TRAILING_STOP_PEG = 8;

  public static final int PEG_TO_LIMIT_PRICE = 9;

  public static final int SHORT_SALE_MIN_PRICE_PEG = 10;

  public PegPriceType() {
    super(1094);
  }

  public PegPriceType(Integer data) {
    super(1094, data);
  }

  public PegPriceType(int data) {
    super(1094, data);
  }
}
