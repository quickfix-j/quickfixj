/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class ListExecInstType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 433;

  public static final char IMMEDIATE = '1';

  public static final char WAIT_FOR_INSTRUCTION = '2';

  public static final char SELL_DRIVEN = '3';

  public static final char BUY_DRIVEN_CASH_TOP_UP = '4';

  public static final char BUY_DRIVEN_CASH_WITHDRAW = '5';

  public ListExecInstType() {
    super(433);
  }

  public ListExecInstType(Character data) {
    super(433, data);
  }

  public ListExecInstType(char data) {
    super(433, data);
  }
}
