/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuotePriceType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 692;

  public static final int PERCENT = 1;

  public static final int PER_SHARE = 2;

  public static final int FIXED_AMOUNT = 3;

  public static final int DISCOUNT = 4;

  public static final int PREMIUM = 5;

  public static final int SPREAD = 6;

  public static final int TEDPRICE = 7;

  public static final int TEDYIELD = 8;

  public static final int YIELD_SPREAD = 9;

  public static final int YIELD = 10;

  public static final int PRICE_SPREAD = 12;

  public static final int PRODUCT_TICKS_IN_HALVES = 13;

  public static final int PRODUCT_TICKS_IN_FOURTHS = 14;

  public static final int PRODUCT_TICKS_IN_EIGHTHS = 15;

  public static final int PRODUCT_TICKS_IN_SIXTEENTHS = 16;

  public static final int PRODUCT_TICKS_IN_THIRTY_SECONDS = 17;

  public static final int PRODUCT_TICKS_IN_SIXTY_FOURTHS = 18;

  public static final int PRODUCT_TICKS_IN_ONE_TWENTY_EIGHTHS = 19;

  public static final int NORMAL_RATE_REPRESENTATION = 20;

  public static final int INVERSE_RATE_REPRESENTATION = 21;

  public static final int BASIS_POINTS = 22;

  public static final int UP_FRONT_POINTS = 23;

  public static final int INTEREST_RATE = 24;

  public static final int PERCENTAGE_OF_NOTIONAL = 25;

  public QuotePriceType() {
    super(692);
  }

  public QuotePriceType(Integer data) {
    super(692, data);
  }

  public QuotePriceType(int data) {
    super(692, data);
  }
}
