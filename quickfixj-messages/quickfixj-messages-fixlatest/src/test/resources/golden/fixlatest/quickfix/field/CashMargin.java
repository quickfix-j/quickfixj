/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class CashMargin extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 544;

  public static final char CASH = '1';

  public static final char MARGIN_OPEN = '2';

  public static final char MARGIN_CLOSE = '3';

  public CashMargin() {
    super(544);
  }

  public CashMargin(Character data) {
    super(544, data);
  }

  public CashMargin(char data) {
    super(544, data);
  }
}
