/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class DlvyInstType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 787;

  public static final char CASH = 'C';

  public static final char SECURITIES = 'S';

  public DlvyInstType() {
    super(787);
  }

  public DlvyInstType(Character data) {
    super(787, data);
  }

  public DlvyInstType(char data) {
    super(787, data);
  }
}
