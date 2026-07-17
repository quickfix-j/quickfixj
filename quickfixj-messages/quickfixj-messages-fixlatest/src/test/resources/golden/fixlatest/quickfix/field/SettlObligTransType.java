/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class SettlObligTransType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1162;

  public static final char CANCEL = 'C';

  public static final char NEW = 'N';

  public static final char REPLACE = 'R';

  public static final char RESTATE = 'T';

  public SettlObligTransType() {
    super(1162);
  }

  public SettlObligTransType(Character data) {
    super(1162, data);
  }

  public SettlObligTransType(char data) {
    super(1162, data);
  }
}
