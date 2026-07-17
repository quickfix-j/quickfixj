/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TriggerPriceType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1107;

  public static final char BEST_OFFER = '1';

  public static final char LAST_TRADE = '2';

  public static final char BEST_BID = '3';

  public static final char BEST_BID_OR_LAST_TRADE = '4';

  public static final char BEST_OFFER_OR_LAST_TRADE = '5';

  public static final char BEST_MID = '6';

  public TriggerPriceType() {
    super(1107);
  }

  public TriggerPriceType(Character data) {
    super(1107, data);
  }

  public TriggerPriceType(char data) {
    super(1107, data);
  }
}
