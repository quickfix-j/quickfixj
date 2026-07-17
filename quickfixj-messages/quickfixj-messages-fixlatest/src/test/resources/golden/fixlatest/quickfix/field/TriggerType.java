/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TriggerType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1100;

  public static final char PARTIAL_EXECUTION = '1';

  public static final char SPECIFIED_TRADING_SESSION = '2';

  public static final char NEXT_AUCTION = '3';

  public static final char PRICE_MOVEMENT = '4';

  public static final char ON_ORDER_ENTRY_OR_MODIFICATION = '5';

  public TriggerType() {
    super(1100);
  }

  public TriggerType(Character data) {
    super(1100, data);
  }

  public TriggerType(char data) {
    super(1100, data);
  }
}
