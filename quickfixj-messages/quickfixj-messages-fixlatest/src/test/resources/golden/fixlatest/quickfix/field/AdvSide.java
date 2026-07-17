/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class AdvSide extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 4;

  public static final char BUY = 'B';

  public static final char SELL = 'S';

  public static final char TRADE = 'T';

  public static final char CROSS = 'X';

  public AdvSide() {
    super(4);
  }

  public AdvSide(Character data) {
    super(4, data);
  }

  public AdvSide(char data) {
    super(4, data);
  }
}
