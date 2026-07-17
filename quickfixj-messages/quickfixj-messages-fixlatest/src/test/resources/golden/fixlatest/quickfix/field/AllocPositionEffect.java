/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class AllocPositionEffect extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1047;

  public static final char OPEN = 'O';

  public static final char CLOSE = 'C';

  public static final char ROLLED = 'R';

  public static final char FIFO = 'F';

  public AllocPositionEffect() {
    super(1047);
  }

  public AllocPositionEffect(Character data) {
    super(1047, data);
  }

  public AllocPositionEffect(char data) {
    super(1047, data);
  }
}
