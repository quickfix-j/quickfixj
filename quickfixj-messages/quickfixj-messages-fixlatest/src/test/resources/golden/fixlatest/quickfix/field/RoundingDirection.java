/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class RoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 468;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public RoundingDirection() {
    super(468);
  }

  public RoundingDirection(Character data) {
    super(468, data);
  }

  public RoundingDirection(char data) {
    super(468, data);
  }
}
