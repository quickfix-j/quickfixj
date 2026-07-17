/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TimeInForce extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 59;

  public static final char DAY = '0';

  public static final char GOOD_TILL_CANCEL = '1';

  public static final char AT_THE_OPENING = '2';

  public static final char IMMEDIATE_OR_CANCEL = '3';

  public static final char FILL_OR_KILL = '4';

  public static final char GOOD_TILL_CROSSING = '5';

  public static final char GOOD_TILL_DATE = '6';

  public static final char AT_THE_CLOSE = '7';

  public static final char GOOD_THROUGH_CROSSING = '8';

  public static final char AT_CROSSING = '9';

  public static final char GOOD_FOR_TIME = 'A';

  public static final char GOOD_FOR_AUCTION = 'B';

  public static final char GOOD_FOR_MONTH = 'C';

  public TimeInForce() {
    super(59);
  }

  public TimeInForce(Character data) {
    super(59, data);
  }

  public TimeInForce(char data) {
    super(59, data);
  }
}
