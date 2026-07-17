/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class ExecType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 150;

  public static final char NEW = '0';

  public static final char DONE_FOR_DAY = '3';

  public static final char CANCELED = '4';

  public static final char REPLACED = '5';

  public static final char PENDING_CANCEL = '6';

  public static final char STOPPED = '7';

  public static final char REJECTED = '8';

  public static final char SUSPENDED = '9';

  public static final char PENDING_NEW = 'A';

  public static final char CALCULATED = 'B';

  public static final char EXPIRED = 'C';

  public static final char RESTATED = 'D';

  public static final char PENDING_REPLACE = 'E';

  public static final char TRADE = 'F';

  public static final char TRADE_CORRECT = 'G';

  public static final char TRADE_CANCEL = 'H';

  public static final char ORDER_STATUS = 'I';

  public static final char TRADE_IN_ACLEARING_HOLD = 'J';

  public static final char TRADE_HAS_BEEN_RELEASED_TO_CLEARING = 'K';

  public static final char TRIGGERED_OR_ACTIVATED_BY_SYSTEM = 'L';

  public static final char LOCKED = 'M';

  public static final char RELEASED = 'N';

  public ExecType() {
    super(150);
  }

  public ExecType(Character data) {
    super(150, data);
  }

  public ExecType(char data) {
    super(150, data);
  }
}
