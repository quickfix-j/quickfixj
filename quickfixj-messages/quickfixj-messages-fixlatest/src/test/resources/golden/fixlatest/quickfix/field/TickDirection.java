/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TickDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 274;

  public static final char PLUS_TICK = '0';

  public static final char ZERO_PLUS_TICK = '1';

  public static final char MINUS_TICK = '2';

  public static final char ZERO_MINUS_TICK = '3';

  public TickDirection() {
    super(274);
  }

  public TickDirection(Character data) {
    super(274, data);
  }

  public TickDirection(char data) {
    super(274, data);
  }
}
