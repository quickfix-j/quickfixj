/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class BasisPxType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 419;

  public static final char CLOSING_PRICE_AT_MORNING_SESSION = '2';

  public static final char CLOSING_PRICE = '3';

  public static final char CURRENT_PRICE = '4';

  public static final char SQ = '5';

  public static final char VWAPTHROUGH_ADAY = '6';

  public static final char VWAPTHROUGH_AMORNING_SESSION = '7';

  public static final char VWAPTHROUGH_AN_AFTERNOON_SESSION = '8';

  public static final char VWAPTHROUGH_ADAY_EXCEPT = '9';

  public static final char VWAPTHROUGH_AMORNING_SESSION_EXCEPT = 'A';

  public static final char VWAPTHROUGH_AN_AFTERNOON_SESSION_EXCEPT = 'B';

  public static final char STRIKE = 'C';

  public static final char OPEN = 'D';

  public static final char OTHERS = 'Z';

  public BasisPxType() {
    super(419);
  }

  public BasisPxType(Character data) {
    super(419, data);
  }

  public BasisPxType(char data) {
    super(419, data);
  }
}
