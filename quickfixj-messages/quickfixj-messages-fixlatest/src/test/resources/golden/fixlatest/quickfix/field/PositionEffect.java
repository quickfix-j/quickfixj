/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class PositionEffect extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 77;

  public static final char CLOSE = 'C';

  public static final char FIFO = 'F';

  public static final char OPEN = 'O';

  public static final char ROLLED = 'R';

  public static final char CLOSE_BUT_NOTIFY_ON_OPEN = 'N';

  public static final char DEFAULT = 'D';

  public PositionEffect() {
    super(77);
  }

  public PositionEffect(Character data) {
    super(77, data);
  }

  public PositionEffect(char data) {
    super(77, data);
  }
}
