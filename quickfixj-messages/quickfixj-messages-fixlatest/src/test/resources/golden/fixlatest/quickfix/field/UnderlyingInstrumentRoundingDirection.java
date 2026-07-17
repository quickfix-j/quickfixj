/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class UnderlyingInstrumentRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2298;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public UnderlyingInstrumentRoundingDirection() {
    super(2298);
  }

  public UnderlyingInstrumentRoundingDirection(Character data) {
    super(2298, data);
  }

  public UnderlyingInstrumentRoundingDirection(char data) {
    super(2298, data);
  }
}
