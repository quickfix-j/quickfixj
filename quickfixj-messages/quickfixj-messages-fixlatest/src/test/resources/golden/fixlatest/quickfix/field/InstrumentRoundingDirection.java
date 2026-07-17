/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class InstrumentRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2144;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public InstrumentRoundingDirection() {
    super(2144);
  }

  public InstrumentRoundingDirection(Character data) {
    super(2144, data);
  }

  public InstrumentRoundingDirection(char data) {
    super(2144, data);
  }
}
