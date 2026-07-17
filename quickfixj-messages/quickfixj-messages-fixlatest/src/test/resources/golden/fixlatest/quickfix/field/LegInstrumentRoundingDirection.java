/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LegInstrumentRoundingDirection extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2214;

  public static final char ROUND_TO_NEAREST = '0';

  public static final char ROUND_DOWN = '1';

  public static final char ROUND_UP = '2';

  public LegInstrumentRoundingDirection() {
    super(2214);
  }

  public LegInstrumentRoundingDirection(Character data) {
    super(2214, data);
  }

  public LegInstrumentRoundingDirection(char data) {
    super(2214, data);
  }
}
