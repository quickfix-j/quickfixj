/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class Side extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 54;

  public static final char BUY = '1';

  public static final char SELL = '2';

  public static final char BUY_MINUS = '3';

  public static final char SELL_PLUS = '4';

  public static final char SELL_SHORT = '5';

  public static final char SELL_SHORT_EXEMPT = '6';

  public static final char UNDISCLOSED = '7';

  public static final char CROSS = '8';

  public static final char CROSS_SHORT = '9';

  public static final char CROSS_SHORT_EXEMPT = 'A';

  public static final char AS_DEFINED = 'B';

  public static final char OPPOSITE = 'C';

  public static final char SUBSCRIBE = 'D';

  public static final char REDEEM = 'E';

  public static final char LEND = 'F';

  public static final char BORROW = 'G';

  public static final char SELL_UNDISCLOSED = 'H';

  public Side() {
    super(54);
  }

  public Side(Character data) {
    super(54, data);
  }

  public Side(char data) {
    super(54, data);
  }
}
