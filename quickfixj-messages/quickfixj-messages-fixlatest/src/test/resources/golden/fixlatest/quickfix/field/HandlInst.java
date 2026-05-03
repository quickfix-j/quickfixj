/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class HandlInst extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 21;

  public static final char AUTOMATED_EXECUTION_NO_INTERVENTION = '1';

  public static final char AUTOMATED_EXECUTION_INTERVENTION_OK = '2';

  public static final char MANUAL_ORDER = '3';

  public HandlInst() {
    super(21);
  }

  public HandlInst(Character data) {
    super(21, data);
  }

  public HandlInst(char data) {
    super(21, data);
  }
}
