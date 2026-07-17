/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class SettlInstTransType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 163;

  public static final char NEW = 'N';

  public static final char CANCEL = 'C';

  public static final char REPLACE = 'R';

  public static final char RESTATE = 'T';

  public SettlInstTransType() {
    super(163);
  }

  public SettlInstTransType(Character data) {
    super(163, data);
  }

  public SettlInstTransType(char data) {
    super(163, data);
  }
}
