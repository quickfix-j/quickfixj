/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class AllocTransType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 71;

  public static final char NEW = '0';

  public static final char REPLACE = '1';

  public static final char CANCEL = '2';

  public static final char PRELIMINARY = '3';

  public static final char CALCULATED = '4';

  public static final char CALCULATED_WITHOUT_PRELIMINARY = '5';

  public static final char REVERSAL = '6';

  public AllocTransType() {
    super(71);
  }

  public AllocTransType(Character data) {
    super(71, data);
  }

  public AllocTransType(char data) {
    super(71, data);
  }
}
