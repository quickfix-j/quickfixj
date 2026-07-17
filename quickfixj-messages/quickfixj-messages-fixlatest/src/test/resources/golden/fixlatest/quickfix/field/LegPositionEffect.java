/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LegPositionEffect extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 564;

  public static final char CLOSE = 'C';

  public static final char FIFO = 'F';

  public static final char OPEN = 'O';

  public static final char ROLLED = 'R';

  public static final char CLOSE_BUT_NOTIFY_ON_OPEN = 'N';

  public static final char DEFAULT = 'D';

  public LegPositionEffect() {
    super(564);
  }

  public LegPositionEffect(Character data) {
    super(564, data);
  }

  public LegPositionEffect(char data) {
    super(564, data);
  }
}
